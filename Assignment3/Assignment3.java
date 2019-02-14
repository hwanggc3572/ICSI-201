/*
Name : Gyuchan Hwang
Student ID : 001336372
*/

import java.io.*; //Needed for File I/O classes
import java.util.Scanner; //Needed for the Scanner class

public class Assignment3 {

 public static void main(String[] args) throws IOException{ //Prevent unexpected event occuring
  
  int days, temperature; //Declare variables
  
  Scanner keyboard = new Scanner(System.in); //Create a Scanner object to read input
  
  System.out.print("Enter the number of days: ");
  days = keyboard.nextInt();
  System.out.println("Number of the days in the period: " + days);
  
  //Get the days
  
  System.out.print("Enter the temperature on the first day: ");
  temperature = keyboard.nextInt();
  System.out.println("Temperature on the first day: " + temperature);
  
  //Get the temperature
  
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
  
  
  
  
  keyboard.nextLine();
  //Consume newLine character to prevent mixing calls with other Scanners
  
  String filename; int inputNum; int numberBelowInput = 0; //Declare variables
  
  System.out.print("Enter the file name: ");
  filename = keyboard.nextLine();
  
  // Get the file name
  
  File file = new File(filename);
  Scanner inputFile = new Scanner(file);
  
  // Open the file
  
  System.out.print("Enter the integer number: ");
  inputNum = keyboard.nextInt();
  System.out.println("The number to check: " + inputNum);
  
  // Get input number
  
  //Read all of the values from the file
  while (inputFile.hasNext()) {
   int numbers = inputFile.nextInt(); //Read the value from the file
   if (numbers < inputNum) {
    numberBelowInput++; //if there is a number less than input number, numberBelowInput plus 1
   }
  }
  
  inputFile.close(); //Close the file
  
  System.out.println("There are " + numberBelowInput + " numbers below " + inputNum);
  
  // Display how many numbers below input number
 
 }

}
