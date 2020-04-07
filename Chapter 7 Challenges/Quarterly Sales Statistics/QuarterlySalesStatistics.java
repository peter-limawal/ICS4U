/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Challenges Q7 Quarterly Sales Statistics
*/

import java.util.Scanner;

public class QuarterlySalesStatistics {
   
   public static void main(String[] args) {
      
      // Declaring 2D array
      double[][] salesFigures = new double[4][6];
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Filling in array
      for (int row = 0; row < salesFigures.length; row++) {
         for (int col = 0; col < salesFigures[row].length; col++) {
            
            System.out.printf("Enter Quarter sales for %d Division %d : $", row + 1, col + 1);
            salesFigures[row][col] = keyboard.nextDouble();
            
            // Parameter
            while (salesFigures[row][col] < 0) {
               System.out.print("ERROR! Sales figure cannot be less than 0!");
               System.out.printf("Enter Quarter sales for %d Division %d : $", row + 1, col + 1);
               salesFigures[row][col] = keyboard.nextDouble();
            }
            
         }
         System.out.println();
      }
      
      // Output
      for (int row = 0; row < salesFigures.length; row++) {
         System.out.printf("\nData for quarter %d\n", row + 1);
         salesFiguresOutput(salesFigures, row);
         salesDifference(salesFigures, row);
         totalSales(salesFigures, row);
         totalDifference(salesFigures, row);
         averageSales(salesFigures, row);
         highestSales(salesFigures, row);
         System.out.print("\n________________________________________________");
      }
            
   } // Main method
   
   private static void salesFiguresOutput(double[][] x, int row) {
      
      for (int col = 0; col < x[row].length; col++) {
         System.out.printf("\nSales figures in Q%d for division %d: $%,.2f", row + 1, col + 1, x[row][col]);
      }
      System.out.println();
      
   } // salesFiguresOutput method
   
   private static void salesDifference(double[][] x, int row) {
      
      if (row > 0) {
         for (int col = 0; col < x[row].length; col++) {
            double diff = x[row][col] - x[row - 1][col];
            System.out.printf("\nDivision %d's difference between Q%d and Q%d: $%,.2f", col + 1, row, row + 1, diff);
         }
         System.out.println();
      }
      
   } // salesDifference method
   
   private static void totalSales(double[][] x, int row) {
      
      double total = 0;
      for (int col = 0; col < x[row].length; col++) {
         total += x[row][col];
      }
      System.out.printf("\nTotal sales for Q%d: $%,.2f", row + 1, total);
      System.out.println();
      
   } // totalSales method
   
   private static void totalDifference(double[][] x, int row) {
      
      if (row > 0) {
         double differences = 0;
         for (int col = 0; col < x[row].length; col++) {
            differences += (x[row][col] - x[row - 1][col]);
         }
         System.out.printf("\nTotal difference between Q%d and Q%d: $%,.2f", row, row + 1, differences);
         System.out.println();
      }
      
   } // totalDifference method
   
   private static void averageSales(double[][] x, int row) {
      
      double total = 0;
      for (int col = 0; col < x[row].length; col++) {
         total += x[row][col];
      }
      double average = total / (double)(x[row].length);
      
      System.out.printf("\nAverage sales for all divisions in Q%d: $%,.2f", row + 1, average);
      System.out.println();
      
   } // averageSales method
   
   private static void highestSales(double[][] x, int row) {
      
      int highest = 0;
      for (int col = 1; col < x[row].length; col++) {
         if (x[row][highest] < x[row][col]) {
            highest = col;
         }
      }
      System.out.printf("\nDivision with the highest sales in Q%d: Division %d", row + 1, highest + 1);
      System.out.println();
      
   } // highestSales method
   
} // End class