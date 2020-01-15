/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 2 Challenges Q7 Sales Tax
*/

import java.util.Scanner; // Import Scanner class

public class SalesTax {

   public static void main(String[] args) {
   
      // Declaring variables
      double purchase;
      double stateTaxPercent;
      double countryTaxPercent;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining purchase input
      System.out.print("Please enter amount of purchase : ");
      purchase = keyboard.nextDouble();
      
      // Obtaining stateTaxPercent input
      System.out.print("Please enter the state sales tax : ");
      stateTaxPercent = keyboard.nextDouble();
      
      // Obtaining countryTaxPercent input
      System.out.print("Please enter the country sales tax : ");
      countryTaxPercent = keyboard.nextDouble();
      
      // Calculations
      double stateTax = purchase * (stateTaxPercent / 100);
      double countryTax = purchase * (countryTaxPercent / 100);
      double totalTax = stateTax + countryTax;
      double totalSale = purchase + totalTax;
      
      // Output
      System.out.printf("\nAmount of purchase: $%.2f", purchase);
      System.out.printf("\nState sales tax: $%.2f", stateTax);
      System.out.printf("\nCountry sales tax: $%.2f", countryTax);
      System.out.printf("\nTotal sales tax: $%.2f", totalTax);
      System.out.printf("\nTotal of sale: $%.2f", totalSale);
   
   } // Main method

} // End class