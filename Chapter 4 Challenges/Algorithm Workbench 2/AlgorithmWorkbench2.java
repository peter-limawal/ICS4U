/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Algorithm Workbench Q2
*/

import java.util.Scanner;

public class AlgorithmWorkbench2 {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int number1;
      int number2;
      int sum;
      String repeat = "yes";
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Do while loop
      do {
         
         // Obtaining number1 input
         System.out.print("Enter first number : ");
         number1 = keyboard.nextInt();
         
         // Obtaining number2 input
         System.out.print("Enter second number : ");
         number2 = keyboard.nextInt();
         
         // Calculation
         sum = number1 + number2;
         
         // Output
         System.out.println("\nThe sum of " + number1 + " and " + number2 + " is " + sum);
         
         // Reobtaining repeat input
         System.out.print("Would you like to repeat the operation? (Yes/No) : ");
         repeat = keyboard.nextLine();
         repeat = keyboard.nextLine();
         
      } while (repeat.equalsIgnoreCase("yes"));
      
   }
   
}