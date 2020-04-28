/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q4 Paint Job Estimator
*/

import java.util.Scanner;

public class PaintJobEstimator {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int numOfRooms;
      double priceOfPaint, gallonsOfPaint, hoursOfLabour, totalCostOfPaint, totalLabourCharges, totalCost;
      double totalWallArea = 0;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining numOfRooms input
      System.out.print("Enter number of rooms to be painted : ");
      numOfRooms = keyboard.nextInt();
      
      // Parameters
      while (numOfRooms < 1) {
         System.out.println("ERROR! Number of rooms cannot be 0 or less!");
         System.out.print("Enter number of rooms to be painted : ");
         numOfRooms = keyboard.nextInt();
      }
      
      // For loop
      for (int i = 1; i <= numOfRooms; i++) {
         
         // Declaring variable
         double wallArea;
         
         // Obtaining wallArea input
         System.out.printf("Enter square feet of wall space in room %d : ", i);
         wallArea = keyboard.nextDouble();
         
         // Parameters
         while (wallArea <= 0) {
            System.out.println("ERROR! Square feet of wall space cannot be 0 or less!");
            System.out.printf("Enter square feet of wall space in room %d : ", i);
            wallArea = keyboard.nextDouble();
         }
         
         totalWallArea += wallArea;
         
      }
      
      // Obtaining priceOfPaint input
      System.out.print("Enter price of paint per gallon : $");
      priceOfPaint = keyboard.nextDouble();
      
      // Parameters
      while (priceOfPaint < 0) {
         System.out.println("ERROR! Price of paint cannot be less than 0!");
         System.out.print("Enter price of paint per gallon : $");
         priceOfPaint = keyboard.nextDouble();
      }
      
      // Obtaining gallonsOfPaint
      gallonsOfPaint = GallonsOfPaint(totalWallArea);
      
      // Obtaining hoursOfLabour
      hoursOfLabour = HoursOfLabour(totalWallArea);
      
      // Obtaining totalCostOfPaint
      totalCostOfPaint = CostOfPaint(gallonsOfPaint, priceOfPaint);
      
      // Obtaining totalLabourCharges
      totalLabourCharges = LabourCharges(hoursOfLabour);
      
      // Obtaining totalCost
      totalCost = TotalCost(totalCostOfPaint, totalLabourCharges);
      
      // Output
      System.out.print("\nNumber of rooms : " + numOfRooms);
      System.out.printf("\nTotal square feet of wall space : %.2f", totalWallArea);
      System.out.printf("\nGallons of paint required : %.2f", gallonsOfPaint);
      System.out.printf("\nHours of labour required : %.2f", hoursOfLabour);
      System.out.printf("\n\nTotal cost of paint : $%,.2f", totalCostOfPaint);
      System.out.printf("\nTotal labour charges : $%,.2f", totalLabourCharges);
      System.out.printf("\nTotal cost of the paint job : $%,.2f", totalCost);
      
   } // Main method
   
   private static double GallonsOfPaint(double totalWallArea) {
   
      // Declaring variable
      double gallons;
   
      // Calculation
      gallons = (totalWallArea / 115) * 1;
      
      // Returning gallons
      return gallons;
      
   } // GallonsOfPaint method
   
   private static double HoursOfLabour(double totalWallArea) {
      
      // Declaring variable
      double hours;
      
      // Calculation
      hours = (totalWallArea / 115) * 8;
      
      // Returning hours
      return hours;
      
   } // HoursOfLabour method
   
   private static double CostOfPaint(double gallonsOfPaint, double priceOfPaint) {
      
      // Declaring variable
      double cost;
      
      // Calculation
      cost = gallonsOfPaint * priceOfPaint;
      
      // Returning cost
      return cost;
      
   } // CostOfPaint method
   
   private static double LabourCharges(double hoursOfLabour) {
      
      // Declaring variable
      double charges;
      double pricePerHour;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining pricePerHour
      System.out.print("How much are the labourers paid per hour? : $");
      pricePerHour = keyboard.nextDouble();
      
      // Parameters
      while (pricePerHour < 0) {
         System.out.println("ERROR! Labourers cannot be paid less than 0!");
         System.out.print("How much are the labourers paid per hour? : $");
         pricePerHour = keyboard.nextDouble();
      }
      
      // Calculation
      charges = hoursOfLabour * pricePerHour;
      
      // Returning charges
      return charges;
      
   } // LabourCharges method
   
   private static double TotalCost(double totalCostOfPaint, double totalLabourCharges) {
      
      // Declaring variable
      double finalCost;
      
      // Calculation
      finalCost = totalCostOfPaint + totalLabourCharges;
      
      // Returning finalCost
      return finalCost;
            
   } // TotalCost method
   
} // End class