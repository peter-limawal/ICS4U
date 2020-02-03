/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 3 Challenges Q15 Bank Charges
*/

import java.util.Scanner; // Import Scanner class

public class BankCharges {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int numOfChecks;
      double checkFees = 0;
      double serviceFee;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining numOfChecks input
      System.out.print("How many checks have you written for the month? : ");
      numOfChecks = keyboard.nextInt();
      
      // If-else-if statement to determine checkFees
      if (numOfChecks >= 0 && numOfChecks < 20) {
         checkFees = 0.10;
      } else if (numOfChecks >= 20 && numOfChecks < 40) {
         checkFees = 0.08;
      } else if (numOfChecks >= 40 && numOfChecks < 60) {
         checkFees = 0.06;
      } else if (numOfChecks >= 60) {
         checkFees = 0.04;
      } else {
         System.out.print("\nERROR! Number of checks written cannot be less than 0!");
      }
      
      // If statement if numOfChecks matches parameters
      if (numOfChecks >= 0) {
         
         // Calculation
         serviceFee = 10.00 + (checkFees * numOfChecks);
         
         // Output
         System.out.print("\nYou have written " + numOfChecks + " checks for the month");
         System.out.printf("\nYou owe the bank $%.2f in service fees for the month", serviceFee);
         
      }
      
   } // Main method
   
} // End class