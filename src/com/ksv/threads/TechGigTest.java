package com.ksv.threads;

public class TechGigTest {

	public static void main(String[] args) {
		
		System.out.println(balancedStringOrNot("as{dsfs}{}sdf{}"));
	}
	public static int balancedStringOrNot(String input1)
    {
	    if(input1.contains("{") && input1.contains("}")){
	        int i = 0;
	        int j = 0;
	        for(int k = 0; k<input1.length(); k++){
	            if('{' == (input1.charAt(k))){
	                i++;
	            }else if('}'==(input1.charAt(k))){
	                j++;
	            }
	        }
	        if(i > 0 && j > 0 && i == j){
	            return 1;
	        }
	    }
	   return -1;
	    
    }
}
