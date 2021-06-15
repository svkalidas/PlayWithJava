package com.ksv.study;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kalidas
 *Solution for checking whether an array of numbers contains at least one pairs of 
 *numbers whose sum give the give some.
 */
public class LogicalProblem1 {
 
	public static void main(String[] args) {
		/*int[] data1 = {1,2,3,9};
		int[] data2 = {1,3,4,4};
		
		System.out.println(solution1(data1, 8));
		System.out.println(solution1(data2, 8));
		
		System.out.println(solution2(data1, 8));
		System.out.println(solution2(data2, 8));*/
		int g = 3;
		System.out.println(++g*8);
		System.out.println(g++*8);
		System.out.println(g);
	}
	/**
	 * for unsorted array
	 * @param data
	 * @param sum
	 * @return
	 */
	public static boolean solution1(int[] data, int sum){
		List<Integer> dataCheck = new ArrayList<Integer>();
		
		for(int value : data){
			
			if(dataCheck.contains(value)){
				return true;
			}else{
				dataCheck.add(sum - value);
			}
		}
		
		return false;
	}
	
	/**
	 * solution for sorted array
	 * @param data
	 * @param sum
	 * @return
	 */
	public static boolean solution2(int[] data, int sum){
		int start = 0;
		int end = data.length - 1;
		
		while(start < end){
			int check = data[start]+data[end];
			if(check == sum){
				return true;
			}else if(check < sum){
				start++;
			}else{
				end--;
			}
		}
		
		return false;
	}
}
