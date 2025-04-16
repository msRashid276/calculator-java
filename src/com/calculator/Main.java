package com.calculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		ArithmaticOperations ar= new ArithmaticOperations();
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter the First Number :");

        double num1 = scn.nextDouble();
        
        System.out.println("Enter the operation +,-");
        
        String sign= scn.next();
        
        
        System.out.println("Enter the Second Number:");
        
        double num2 = scn.nextDouble();
        
        System.out.println("Do you Want to contionu Yes /No");
        
        
        double result =0; 
    switch(sign){
    
    
    case "+":
    	  result= ar.additionService(num1, num2);
    	 System.out.println("Result is =" +result);
    	 break;
    	 
    case "-":
    	  result =ar.substractionService(num1, num2);
    	System.out.println("Result is ="+ result);
    	break;
    	
    	

        
        	
    	
        	 
        }
	
        
        
        
	}
	

}
