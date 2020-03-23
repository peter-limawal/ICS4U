/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Challenges Q12 SavingsAccount Class
*/

import java.util.Scanner;

public class SavingsAccountClass {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double annualInterest;
      double sumInterest = 0;
      double balance;
      int numOfMonths;
      double deposit;
      double sumDeposit = 0;
      double withdraw;
      double sumWithdraw = 0;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining inputs
      System.out.print("Enter annual interest rate : ");
      annualInterest = keyboard.nextDouble();
      System.out.print("Enter starting balance : $");
      balance = keyboard.nextDouble();
      System.out.print("Enter # of months since account created : ");
      numOfMonths = keyboard.nextInt();
      
      // Creating object
      SavingsAccount a = new SavingsAccount(balance);
      
      // annualInterest mutator
      a.setAnnualInterest(annualInterest);
      
      // For loop
      for (int i = 1; i <= numOfMonths; i++) {
         
         // Obtaining deposit input
         System.out.print("\nHow much did you deposit during month " + i + "? : $");
         deposit = keyboard.nextDouble();
         sumDeposit += deposit;
         a.deposit(deposit);
         
         // Obtaining withdraw input
         System.out.print("How much did you withdraw during month " + i + "? : $");
         withdraw = keyboard.nextDouble();
         sumWithdraw += withdraw;
         a.withdraw(withdraw);
         
         // Calculating monthly interest
         a.addMonthlyInterest();
         sumInterest += a.getMonthlyInterest();
         
      }
      
      // Outputs
      System.out.printf("\nEnding balance: $%,.2f", a.getBalance());
      System.out.printf("\nTotal amount of deposits: $%,.2f", sumDeposit);
      System.out.printf("\nTotal amount of withdrawals: $%,.2f", sumWithdraw);
      System.out.printf("\nTotal interest earned: $%,.2f", sumInterest);
      
   } // Main method
   
} // End class