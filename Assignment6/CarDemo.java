/*
Name : Gyuchan Hwang
Student ID : 001336372
*/

import java.util.Scanner; // Needed for the Scanner class

public class CarDemo {

 
 public static void main(String[] args) {
  String[] make = new String[3]; 
  String[] model = new String[3];
  int[] year = new int[3];
  int[] price = new int[3];
  int totalPrice;
  // Declare variables
  
  Scanner keyboard = new Scanner(System.in); // Create a Scanner object to read input
  
  for(int i=0; i<=2; i++) {
   System.out.print("Write the make of car" + (i+1) + " : " );
   make[i] = keyboard.nextLine();
   System.out.println("make of car" + (i+1) + " = " + make[i]);
  }
  System.out.println( );
  for(int i=0; i<=2; i++) {
   System.out.print("Write the model of car" + (i+1) + " : " );
   model[i] = keyboard.nextLine();
   System.out.println("model of car" + (i+1) + " = " + model[i]);
  }
  System.out.println( );
  for(int i=0; i<=2; i++) {
   System.out.print("Write the year of car" + (i+1) + " : " );
   year[i] = keyboard.nextInt();
   System.out.println("year of car" + (i+1) + " = " + year[i]);
  }
  System.out.println( );
  for(int i=0; i<=2; i++) {
   System.out.print("Write the price of car" + (i+1) + " : " );
   price[i] = keyboard.nextInt();
   System.out.println("price of car" + (i+1) + " = " + price[i]);
  }
  //using for loop and arrays to make cars
  
  
  System.out.println( );
  System.out.println("Detail of each car");
  System.out.println( );
  
  Car car1 = new Car(make[0], model[0], year[0], price[0]);  // create car1
   System.out.println("Make of Car1 : " + car1.getMake());
   System.out.println("Model of Car1 : " + car1.getModel());
   System.out.println("Year of Car1 : " + car1.getYear());
   System.out.println("Price of Car1 : " + car1.getPrice());
   System.out.println( );
   
  Car car2 = new Car(make[1], model[1], year[1], price[1]);  // create car2
   System.out.println("Make of Car2 : " + car2.getMake());
   System.out.println("Model of Car2 : " + car2.getModel());
   System.out.println("Year of Car2 : " + car2.getYear());
   System.out.println("Price of Car2 : " + car2.getPrice());
   System.out.println( );
   
  Car car3 = new Car(make[2], model[2], year[2], price[2]);  // create car3
   System.out.println("Make of Car3 : " + car3.getMake());
   System.out.println("Model of Car3 : " + car3.getModel());
   System.out.println("Year of Car3 : " + car3.getYear());
   System.out.println("Price of Car3 : " + car3.getPrice());
   System.out.println( );
   
   // Display the detail of each car
  
  System.out.println("The total price of cars : " + Car.getTotalPrice(price[0], price[1], price[2])); 
  // Calculate and display the total price
  
 }
 
}
