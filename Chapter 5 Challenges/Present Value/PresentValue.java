/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q16 Present Value
*/

import java.util.Scanner;

public class PresentValue {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double present, future, interest;
      int years;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining future input
      System.out.print("Enter future value you want in your account : ");
      future = keyboard.nextDouble();
      
      // Obtaining interest input
      System.out.print("Enter annual interest rate : ");
      interest = keyboard.nextDouble();
      
      // Obtaining years input
      System.out.print("Enter number of years you plan to let the money sit in the account : ");
      years = keyboard.nextInt();
      
      // Calling presentValue method
      present = presentValue(future, interest, years);
      
      // Output
      System.out.printf("\nThe amount you need to deposit today is $%,.2f", present);
      
   }
   
   private static double presentValue(double future, double interest, int years) {
      
      // Declaring variable
      double present;
      
      // Calculation
      present = ((double)future) / (double)Math.pow((1 + (double)(interest / 100)), (double)years);
      
      // Returning present
      return present;
      
   } // presentValue method
   
} // End class