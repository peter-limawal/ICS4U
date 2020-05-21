/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Program One
*/

import java.util.Scanner;

public class ProgramOneCFive {
   
   public static void main(String[] args) {
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Declaring variables
      String name;
      
      // Obtaining name input
      System.out.print("Please enter your name : ");
      name = keyboard.nextLine();
      
      // Calling greetMe method
   // Method  Argum-
   //  name    ents
      greetMe( name );
      
   } // Main method
   
//     Method   Return  Method
//    modifiers   type   name  Parentheses
   private static void greetMe(String name) {
      
      // Output
      System.out.print("Hello " + name + ", nice to meet you!");
      
   } // greetMe method
   
} // End class