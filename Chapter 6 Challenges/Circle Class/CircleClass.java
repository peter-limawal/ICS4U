/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Challenges Q7 Circle Class
*/

import java.util.Scanner;

public class CircleClass {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double radius;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining radius input
      System.out.print("Enter circle radius : ");
      radius = keyboard.nextDouble();
      
      // Creating object
      Circle a = new Circle(radius);
      
      // Output
      System.out.printf("\nThe circle's area is: %.2f cm^2", a.getArea());
      System.out.printf("\nThe circle's diameter is: %.2f cm",a.getDiameter());
      System.out.printf("\nThe circle's circumference is: %.2f cm\n", a.getCircumference());
      
   } // Main method
   
} // End class