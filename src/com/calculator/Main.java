package com.calculator;

import java.util.Scanner;

public class Main {
	
	

	public static void main(String args[]) {
		
		ArithmaticOperations ar= new ArithmaticOperations();
		Scanner scn =new Scanner(System.in);
		
		System.out.println("Enter the First Number :");

        double num1 = scn.nextDouble();
        
        System.out.println("Enter the operation +,-,/,*");
        
        String sign= scn.next();
        
        
        System.out.println("Enter the Second Number:");
        
        double num2 = scn.nextDouble();
        


       
        
        
        
        double result =0; 
    switch(sign){
    
    
    case "+":
    	  result= ar.additionService(num1, num2);
//    	 System.out.println("Result is =" +result);
    	 break;
    	 
    case "-":
    	  result =ar.substractionService(num1, num2);
//    	System.out.println("Result is ="+ result);
    	break;
    	
    case "*":
    	result =ar.multiplicationService(num1, num2);
//    	System.out.println("Result is ="+result);
    	break;
    	
    case "/":	
    	if(num2 ==0) {
    		System.out.println("can not divisible by Zero");
    		
    	}
    	else {
    		result = ar.divisionService(num1, num2);
//    		System.out.println("Result ="+result);
    	}
    	break;
    	

    default:
    	System.out.print("Invalid Operation");
    	
      
        	
    	
        	 
        }
	
    System.out.println("Result ="+result);
    System.out.println("Do you Want to contionu Yes /No");
    String choice=scn.next();
    
//  
while(choice.equalsIgnoreCase("yes")) {
	
	System.out.print("Thanks");
	scn.close();
}
        
        
        
	}
	
	
	

}
