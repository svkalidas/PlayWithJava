package com.ksv.reflectionapi;

class Test { 
    // creating a private field 
    private String s; 
    
    public String k;
  
    // creating a public constructor 
    public Test(String name)  {  s = name; } 
    
    private Test() {
    	s = "Private Constructor";
    }
    
    public Test(int i) {
    	System.out.println(i);
    }
    
  
    // Creating a public method with no arguments 
    public void method1()  { 
        System.out.println("The string is " + s); 
    } 
  
    // Creating a public method with int as argument 
    public void method2(int n)  { 
        System.out.println("The number is " + n); 
    } 
  
    // creating a private method 
    private void method3() { 
        System.out.println("Private method invoked"); 
    } 
} 