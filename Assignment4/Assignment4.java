/*
 Name : Gyuchan Hwnag
 Student ID : 001336372 
 */

import java.util.Scanner; // For the Scanner class
import java.io.*;   // For the I/O classes

public class Assignment4 {

 public static void main(String[] args) throws IOException {
  
  int days, temperature; // Declare the variables
  
  Scanner keyboard = new Scanner(System.in); //Create a Scanner object to read input
  
  System.out.print("Enter the number of days: ");
  days = keyboard.nextInt();
  System.out.println("Number of the days in the period: " + days);
  
  //Get the days
  
  System.out.print("Enter the temperature on the first day: ");
  temperature = keyboard.nextInt();
  System.out.println("Temperature on the first day: " + temperature);
  
  //Get the temperature
  
  DisplayTemperature(days, temperature); // Call the DisplayTemperature method
  
  
  keyboard.nextLine();
  //Consume newLine character to prevent mixing calls with other Scanners
  
  String filename; int maxNum; // Declare variable
  
  System.out.print("Enter the file name: ");
  filename = keyboard.nextLine();
  
  // Get the file name
  
  maxNum = ReadAndFindMax(filename);  // Call the ReadAndFindMax method and get maximum number
  
  System.out.println("The maximum number is " + maxNum); // Print the maximum number
  
 }
 
 
 /*
  The DisplayTemperature method outputs the temperature table
  @param days The number of days
  @param temperature The temperature on the first day
  */
 
 public static void DisplayTemperature(int days, int temperature) {
  
  System.out.println("Day" + "\t" + "Temperature");
  for (int i=1; i<=days; i++) {
   if (i < days/2) {
    System.out.println(i + "\t" + temperature);
    temperature -= 2;
   } else  {
    System.out.println(i + "\t" + temperature);
    temperature++ ;
   }
  }
  //Using the for loop
 }
 
 /*
  The ReadAndFindMax method opens a file, reads the numbers, 
  finds the maximum number among the numbers and returns it
  @param filename The name of the file to open
  @return The maximum number among the numbers
  */
 
 public static int ReadAndFindMax(String filename) throws IOException {
  
  int number; // number in file
  int maxNum = 0; // Declare the variable to find the maximum number
  
  File file = new File(filename);
  Scanner inputFile = new Scanner(file);
  
  // Open the file
  
  // Read all of the values from the file and find the maximum number
  while (inputFile.hasNext()) {
   number = inputFile.nextInt();
   
   // if number = maxNum, maximum number is number and stop the loop
   while (number > maxNum) {
    maxNum++;
   }
  }
    
  inputFile.close(); // Close the file
  
  return maxNum; // Return the maximum number
 }

}
