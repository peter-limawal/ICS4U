/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Challenges Q13 Deposit and Withdrawal Files
*/

import java.util.Scanner;
import java.io.*;

public class DepositAndWithdrawalFiles {
   
   public static void main(String[] args) throws IOException {
      
      // Declaring variables
      double balance;
      double annualInterest;
      double monthlyInterest;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining inputs
      System.out.print("Enter annual interest rate : ");
      annualInterest = keyboard.nextDouble();
      System.out.print("Enter starting balance : $");
      balance = keyboard.nextDouble();
      
      // Creating object
      SavingsAccount a = new SavingsAccount(balance);
      
      // annualInterest mutator
      a.setAnnualInterest(annualInterest);
      
      // Reading file
      File file = new File("Deposits.txt");
      Scanner st = new Scanner(file);
      
      // Do-While loop
      do {
         
         // Obtaining input
         String deposit = st.nextLine();
         
         // deposit method
         a.deposit(deposit);
         
      } while (st.hasNext());
      
      // Reading file
      File file2 = new File("Withdrawals.txt");
      Scanner str = new Scanner(file2);
      
      // Do-While loop
      do {
         
         // Obtaining input
         String withdraw = str.nextLine();
         
         // withdraw method
         a.withdraw(withdraw);
         
      } while (str.hasNext());
      
      // Calculating monthly interest
      monthlyInterest = a.getMonthlyInterest();
      a.addMonthlyInterest();
      
      // Output
      System.out.printf("\nEnding balance: $%,.2f", a.getBalance());
      System.out.printf("\nTotal interest earned: $%,.2f", monthlyInterest);
      
      
   } // Main method
   
} // End class