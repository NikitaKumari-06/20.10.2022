/*
 *3. Create a class Book with id, name as the member variables.

Create  BookNotFoundException as a exception and create one argument constructor which is accepting String message.

Create a test class with an array of 5 books with ids starting from 1.

Create a method findById(Book[] books , int id) which will take the previously created book array and one id to find the book.

Print "Found" if the book is present with the given id else throw BookNotFoundException with a message "Book with the given id is not present".

Handle the exception in main method and print the stacktrace in catch block.

 */
package com.week.test;

public class BookMain {

	public static void main(String[] args) {
		
		//Creating array of Book type
		Book[] arr = new Book[6];
	
			arr[0] = new Book(101, "Ramcharitmanas");
			arr[1] = new Book(102, "Pranay Parag");
			arr[2] = new Book(103, "Shivpuran");
			arr[3] = new Book(104, "Brahmastra");
			arr[4] = new Book(105, "mystery of world");
		
			try {
				boolean isFound = findById(arr, 10);  //Calling method findById 
				if(isFound)
					System.out.println("Found");
			}
			catch(BookNotFoundException ex) {
				
				//System.out.println(ex.getMessage());
				ex.printStackTrace();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
	}
	
	// Method to match the given id with the  id of array of Book 
		public static boolean findById(Book[] books, int id) throws BookNotFoundException {
			
			for(int i = 0; i< books.length; i++) {
				
				if(books[i].getId() == id) 
					//System.out.println("Found");
					return true;
				
				else 
					throw new BookNotFoundException("Book not found.");
				
			}
			return false;
			
		}
		

}
