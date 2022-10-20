/*
 * 2.	After mentioning to Professor Jackson that you would like to get some more practice with exceptions, she offered to let you write some grading software! Before she gives you full control over auto-grading students’ work, she asked if you could write a function called checkFileExtension(). 

The checkFileExtension() method takes in one parameter: fileName.

checkFileExtension() should return an integer representing the number of points a student receives for properly submitting a file in Java. 

If a student’s submitted file ends in .java, they get 1 point. 

If a student’s submitted file doesn’t end in .java, they get 0 points. 

If the file submitted is null or an empty string, an exception should be thrown and you should give the student -1 points. 

What kind of exception is up to you, including to a custom exception!

In main(), Professor Jackson has provided a array of students and the names of their submitted files for you to test out your work. 

If an exception is caught, make sure to print out the error message.

 */
package com.week.test;

public class FileExtension {
public static void main(String[] args) {
		
		String []names = {"Prahash", "Chaithanya", "Ramesh"};  //array of student's name
		String []files = {"Circle.java", "notes.txt", ""};    //array of their files
		
		int i=0;
		
		for(String file:files) {  //using for loop for string values
		System.out.println(i);   
		
			try {
			
			//Calling of method in main method to check file extensions
			int r = checkFileExtension(file);
	       
			if(r==1)//condition check
				System.out.println("Hello " + names[i] +". Your " + file + " is a java file. And your score is 1");
			else
				System.out.println("Hello " + names[i] +". Your " + file + " is not a java file. And your score is 0");
			 
		}	
			
			
		catch(NullException ex) {//null string
			System.out.println("Hello " + names[i] +". You have send a null. Your score is -1");
			System.out.println(ex.getMessage());
		}
				
		catch(EmptyException ex) {//empty string
			System.out.println("Hello " + names[i] +". You have send an empty string. Your score is -1");
			System.out.println(ex.getMessage());
		}
		
		catch(Exception ex) {//other exception
			System.out.println("Your score is -1");
			System.out.println(ex.getMessage());
		}
				
			i++;	//increment
		}    
	}

	//Method to check file extensions
	public static int checkFileExtension(String fileName) throws NullException, EmptyException {
		
		if(fileName == null)
			throw new NullException("You have send the null string.");
		
		
		if(fileName.isEmpty())
			throw new EmptyException("You have send the empty string.");
		
		if(fileName.endsWith(".java"))
			return 1;
		else 
			return 0;
	}
		
}
