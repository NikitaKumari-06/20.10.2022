/*
 *3. Create a class Book with id, name as the member variables.

Create  BookNotFoundException as a exception and create one argument constructor which is accepting String message.

Create a test class with an array of 5 books with ids starting from 1.

Create a method findById(Book[] books , int id) which will take the previously created book array and one id to find the book.

Print "Found" if the book is present with the given id else throw BookNotFoundException with a message "Book with the given id is not present".

Handle the exception in main method and print the stacktrace in catch block.

 */
package com.week.test;

public class Book {
	
	private int id;
	private String name;
	
	//Constructor of Book
	public Book(int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	//getter and setter of id
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	//getter and setter of name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Book[id : " + id + " name : " + name + " ]" ;
		
	}
	
}
