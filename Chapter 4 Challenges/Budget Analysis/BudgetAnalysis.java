/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q16 Budget Analysis
*/

import java.util.Scanner;

public class BudgetAnalysis {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double budget = 0;
      double tally = 0;
      double expense = 0;
      int count = 1;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining budget input
      System.out.print("What is your monthly budget? : ");
      budget = keyboard.nextDouble();
      
      while (expense != -99) {
      
         tally += expense;
         
         System.out.printf("Enter expense %d (enter -99 to finish) : ", count);
         count++;
         
         expense = keyboard.nextDouble();
         
      }
      
      if (budget <= tally) {
         System.out.printf("\nYou are $%.2f over budget!", (tally - budget));
      } else if (budget > tally) {
         System.out.printf("\nYou are $%.2f under budget.", (budget - tally));
      }
      
   }
   
}