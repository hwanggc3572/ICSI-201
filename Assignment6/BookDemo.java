/*
 Name : Gyuchan Hwang
 Student ID : 001336372
 */

import java.util.Scanner; // Needed for the Scanner class

public class BookDemo {

 public static void main(String[] args) {
  Book book = new Book(); // Create an object
  
  String title, author, publisher;
  int numberOfCopies;
  // Declare variables
  
  Scanner keyboard = new Scanner(System.in); // Create a Scanner object to read input
  
  System.out.print("Write the title : ");
  title = keyboard.nextLine();
  book.setTitle(title);
  System.out.println("Title is " + book.getTitle());
  // Set and Get title and display it
  
  System.out.print("Write the author : ");
  author = keyboard.nextLine();
  book.setAuthor(author);
  System.out.println("Author is " + book.getAuthor());
  // Set and Get author and display it
  
  System.out.print("Write the publisher : ");
  publisher = keyboard.nextLine();
  book.setPublisher(publisher);
  System.out.println("Publisher is " + book.getPublisher());
  // Set and Get publisher and display it
  
  System.out.print("Write the number of copies : ");
  numberOfCopies = keyboard.nextInt();
  book.setCopies(numberOfCopies);
  System.out.println("The number of copies is " + book.getCopies());
  // Set and Get number of copies and display it
 }

}
