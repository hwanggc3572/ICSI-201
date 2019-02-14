/* Gyuchan Hwang
 * Student ID number : 001336372
 * */

import java.util.Scanner; //Needed for the Scanner class

public class Assignment2 {
  
  public static void main(String[] args) { 
    
  int firstNumber, secondNumber, thirdNumber, choice; //Declare variables
  
  Scanner keyboard = new Scanner(System.in); //Create a Scanner object to read input
  
  System.out.print("What is the first number?");
  firstNumber = keyboard.nextInt();
  System.out.println("First number: " + firstNumber);
  
  System.out.print("What is the second number?");
  secondNumber = keyboard.nextInt();
  System.out.println("Second number: " + secondNumber);
  
  System.out.print("What is the third number?");
  thirdNumber = keyboard.nextInt();
  System.out.println("Third number: " + thirdNumber);
  
  System.out.print("Enter 1(for greatest) and 2(for smallest)");
  choice = keyboard.nextInt();
  
  int greatestNumber = 0;
  int smallestNumber = 0;
  
  //get the numbers, choice and declare the variables
  
  if(choice == 1) {
   if (firstNumber < secondNumber) {
    if (secondNumber < thirdNumber) {
     greatestNumber = thirdNumber;
    } else {
     greatestNumber = secondNumber;
    }
   } else {
    if (firstNumber > thirdNumber) {
     greatestNumber = firstNumber;
    } else {
     greatestNumber = thirdNumber;
    }
   }
   System.out.println("The greatest of these three numbers is " + greatestNumber);
  } else if(choice == 2) {
   if (firstNumber > secondNumber) {
    if (secondNumber > thirdNumber) {
     smallestNumber = thirdNumber;
    } else {
     smallestNumber = secondNumber;
    }
   } else {
    if (firstNumber < thirdNumber) {
     smallestNumber = firstNumber;
    } else {
     smallestNumber = thirdNumber;
    }
   }
   System.out.println("The smallest of these three number is " + smallestNumber);
  }

  // Using nested if and if - else if to find the greastest number and smallest number
  
  System.out.println();
  
  String firstName, middleName, lastName;
  int sortOrder;
  
  //Declare variables
  
  keyboard.nextLine();
  //Consume newLine characters : Solution of Mixing calls to nextLine with Other Scanner method calls
  
  System.out.print("What is your first name?");
  firstName = keyboard.nextLine();
  System.out.println("First name: " + firstName);
  
  System.out.print("What is yout middle name?");
  middleName = keyboard.nextLine();
  System.out.println("Middle name: " + middleName);
  
  System.out.print("What is your last name?");
  lastName = keyboard.nextLine();
  System.out.println("Last name: " + lastName);
  
  System.out.print("Enter 1(ascending alphabetical order) and 2(descending alphabetical order)");
  sortOrder = keyboard.nextInt();
  
  String fullName = null;
  
  //get names, sortOrder, declare fullName
  
  if (sortOrder == 1) {
   if (firstName.charAt(0) < middleName.charAt(0) && firstName.charAt(0) < lastName.charAt(0)) {
    if (middleName.charAt(0) < lastName.charAt(0)) {
     fullName = firstName +" " + middleName + " "+ lastName;
    } else {
     fullName = firstName +" " + lastName +" " + middleName;
    }
   } else if (middleName.charAt(0) < firstName.charAt(0) && middleName.charAt(0) < lastName.charAt(0)) {
    if (firstName.charAt(0) < lastName.charAt(0)) {
     fullName = middleName +" " + firstName +" " + lastName;
    } else {
     fullName = middleName +" " + lastName +" " + firstName;
    }
   } else if (lastName.charAt(0) < firstName.charAt(0) && lastName.charAt(0) < middleName.charAt(0)) {
    if (firstName.charAt(0) < middleName.charAt(0)) {
     fullName = lastName +" " + firstName +" " + middleName;
    } else {
     fullName = lastName +" " + middleName +" " + firstName;
    }
   }
  } else if (sortOrder == 2) {
   if (firstName.charAt(0) > middleName.charAt(0) && firstName.charAt(0) > lastName.charAt(0)) {
    if (middleName.charAt(0) > lastName.charAt(0)) {
     fullName = firstName +" " + middleName  +" "+ lastName;
    } else {
     fullName = firstName +" " + lastName +" " + middleName;
    }
   } else if (middleName.charAt(0) > firstName.charAt(0) && middleName.charAt(0) > lastName.charAt(0)) {
    if (firstName.charAt(0) > lastName.charAt(0)) {
     fullName = middleName +" " + firstName +" " + lastName;
    } else {
     fullName = middleName  +" "+ lastName +" " + firstName;
    }
   } else if (lastName.charAt(0) > firstName.charAt(0) && lastName.charAt(0) > middleName.charAt(0)) {
    if (firstName.charAt(0) > middleName.charAt(0)) {
     fullName = lastName +" " + firstName  +" "+ middleName;
    } else {
     fullName = lastName +" " + middleName +" " + firstName;
    }
   }
  }
  //Using nested if and if - else if to check the alphabetic order
  
  if (firstName.length() + middleName.length() + lastName.length() < 20) {
   System.out.println(fullName + "- OK");
  } else {
   System.out.println(fullName + "- Too long");
  }
    
  //Check the length of fullName and put additional statement
  
  }
  
}
