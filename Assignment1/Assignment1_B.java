import java.util.Scanner;
import javax.swing.JOptionPane;

public class Assignment1_B {
  
  
  public static void main(String[] args) { 
    
    double radius;
    double area;
    final double PI = 3.14;
    Scanner keyboard = new Scanner(System.in);
    System.out.print("What is the radius of the circle?");
    radius = keyboard.nextDouble();
    area = radius * radius * PI;
    System.out.println("The area of a circle of radius " + radius + " centimeter is " + area + " cm seq.");
    
    
    String name;
    String age;
    name = JOptionPane.showInputDialog("What is your name?");
    age = JOptionPane.showInputDialog("What is your age?");
    int sum = Integer.parseInt(age)/10 + Integer.parseInt(age)%10;
    JOptionPane.showMessageDialog(null, "The sum of digits of age of " + name + " is " + sum);
    System.exit(0);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
