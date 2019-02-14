/*
 Name : Gyuchan Hwang
 Student ID : 001336372 
 */

import java.util.Scanner; //For the Scanner class

public class Assignment5 {

 public static void main(String[] args) {

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
  
  TemperaturePattern tempPatt = new TemperaturePattern(days, temperature); 
  //Create an instance of the TemperaturePattern class, passing the data that was entered as arguments to the constructor. 
  
  System.out.println("Temperature on the final day would be: " + tempPatt.findFinalDayTemperature(days, temperature));
  //Get the final day's temperature and display it
  
  
  int score1, score2, score3; //Declare the variables
  
  System.out.print("Enter the first score : ");
  score1 = keyboard.nextInt();
  System.out.println("Score1 : " + score1);
  
  System.out.print("Enter the second score : ");
  score2 = keyboard.nextInt();
  System.out.println("Score2 : " + score2);
  
  System.out.print("Enter the third score : ");
  score3 = keyboard.nextInt();
  System.out.println("Score3 : " + score3);
  
  //Get the scores
  
  TestScores findAvg = new TestScores(score1, score2, score3);
  //Create an instance of the TestScores class, passing the data that was entered as arguments to the constructor.
  
  System.out.println("The average of the scores = " + findAvg.getAverage());
  //Get the data from the findAvg and display it
  
 }

}
