package com.ksv.codingChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HackerRankArrayGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}

			System.out.println((isSolvable(leap, game, 0)) ? "YES" : "NO");
		}
		scan.close();
	}

	private static boolean canWin(int leap, int[] game, int i, boolean result) {

//			int i = 0;
//			while(i < n) {
//				
//				if(i== n-1 || i+leap >= n) {
//					return true;
//				}else {
//					i = game[i+leap]==0?i+leap:game[i+1]==0?i+1:i>0 && game[i-1]==0?i-1:n;
//					if(i ==0 || i==n) {
//						return false;
//					}
//				}
//			}

		if (result == false) {
			int n = game.length;

			if (i == n - 1 || i + leap >= n) {
				return true;
			} else {
				i = game[i + leap] == 0 ? i + leap : game[i + 1] == 0 ? i + 1 : i > 0 && game[i - 1] == 0 ? i - 1 : n;
				if (i == 0 || i == n) {
					return canWin(leap, game, i, false);
				}
			}
		}
		return true;
	}

	private static boolean canWin1(int leap, int[] game, int i) {

		if (i < game.length - 1 && i >= 0) {
			if (game[i] == 0 && (i + leap >= game.length || i == game.length - 1)) {
				return true;
			}
			if (game[i] == 1) {
				return false;
			}
			game[i] = 1;
			// if ( (i + leap < game.length && game[i + leap] == 0) || ( i + 1 < game.length
			// && game[i + 1] == 0)) {
			return canWin1(leap, game, i + 1) || canWin1(leap, game, i - 1) || canWin1(leap, game, i + leap);
			// }
		}
		// i = game[i+leap]==0?i+leap:game[i+1]==0?i+1:i>0 &&
		// game[i-1]==0?i-1:game.length;
		return false;

	}
	
	private static boolean canWin2(int leap, int[] game, int i) {

		if (i > game.length - 1 || i < 0 || game[i] == 1) 
			return false;
		if (game[i] == 0 && (i + leap >= game.length || i == game.length - 1)) 
				return true;
			
			game[i] = 1;
			// if ( (i + leap < game.length && game[i + leap] == 0) || ( i + 1 < game.length
			// && game[i + 1] == 0)) {
			return canWin2(leap, game, i + 1) || canWin2(leap, game, i - 1) || canWin2(leap, game, i + leap);
			// }

	}
	
	private static boolean isSolvable(int m, int[] arr, int i) {
	    if (i < 0 || arr[i] == 1) return false;
	    if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

	    arr[i] = 1;
	    return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
	}

	private static boolean checkWin(int leap, int[] game, int i) {

		if (i == game.length - 1 || i + leap >= game.length)
			return true;
		if (game[i] == 1)
			return false;

		game[i] = 1;

		return checkWin(leap, game, i - 1) || checkWin(leap, game, i + 1) || checkWin(leap, game, i + leap);
	}
}
