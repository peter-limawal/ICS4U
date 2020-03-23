/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Challenges Q2 Car Class
*/

import java.util.Scanner;

public class CarClass {
   
   public static void main(String[] args) {
   
      // Declaring variables
      int yearModel;
      String make;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining inputs
      System.out.print("Enter car year model : ");
      yearModel = keyboard.nextInt();
      System.out.print("Enter car make : ");
      keyboard.nextLine();
      make = keyboard.nextLine();
      
      // Creating object
      Car a = new Car(yearModel, make);
      
      // Calling accelerate method
      accelerate(a);
      
      // Calling brake method
      brake(a);
      
   } // Main method
   
   private static void accelerate(Car x) {
   
      // Output
      System.out.println("Accelerating:");
      
      // For loop
      for (int i = 0; i < 5; i++) {
         x.accelerate();
         
         // Accessing car speed
         System.out.println("The " + x.getYearModel() + " " + x.getMake() + "'s speed is " + x.getSpeed() +" km/h");
      }
      
   } // accelerate method
   
   private static void brake(Car x) {
   
      // Output
      System.out.println("Braking:");
      
      // For loop
      for (int i = 0; i < 5; i++) {
         x.brake();
         
         // Accessing car speed
         System.out.println("The " + x.getYearModel() + " " + x.getMake() + "'s speed is " + x.getSpeed() +" km/h");
      }
      
   } // brake method
   
} // End class