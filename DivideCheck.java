/*
 * 1.	The professor you TA (Training Associate) for, Professor Jackson, shared with you the code she uses to auto-grade students’ work. She and the other TAs have encountered some problems with the code in the past when they enter the total possible point value for an assignment. Occasionally, they accidentally enter 0 for the total number of possible points and the program encounters a fatal error when trying to divide by 0.

To help out with this issue, complete a function called divide() in Main. 

The divide() method takes in two parameters: x and y.

Your function should return the result of x/y.

However, if y is zero, you should throw an exception. 

Try to use an ArithmeticException and put your try/catch block in divide() to test out your error-handling skills. 

If an exception is caught, make sure to print out a helpful message.

 */
package com.week.test;

import java.util.Scanner;

public class DivideCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Take inputs from user
		System.out.println("Enter numbers for division : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		try {
			int div = divide(num1 , num2);   //call of divide method
			System.out.println("Result : " + div);
		}
		
		catch(ArithmeticException ex) {
			System.out.println("Exception Caught !");
			System.out.println(ex.getMessage());
		}
		
		sc.close();
	}

	
	//Method to perform division
	public static int divide(int i, int j) throws ArithmeticException{
		if(j == 0) {
			throw new ArithmeticException("Denominator can't be zero.");   //exception will be thrown
		}
		return i/j;
	}

}
