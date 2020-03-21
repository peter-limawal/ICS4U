/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Challenges Q4 RetailItem Class
*/

import java.util.Scanner;

public class RetailItemClass {
   
   public static void main(String[] args) {
      
      // Creating objects
      RetailItem a = new RetailItem("Jacket", 12, 59.95);
      RetailItem b = new RetailItem("Designer Jeans", "40", "34.95");
      RetailItem c = new RetailItem();
      
      // Calling setter method
      setter(c);
      
      // Calling getter method
      getter(a);
      getter(b);
      getter(c);
      
   } // Main method
   
   private static void setter(RetailItem x) {
      
      // Declaring variables
      String description, unitsOnHand, price;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining inputs
      System.out.print("Enter description : ");
      description = keyboard.nextLine();
      System.out.print("Enter units on hand : ");
      unitsOnHand = keyboard.nextLine();
      System.out.print("Enter price : ");
      price = keyboard.nextLine();
      
      x.setDescription(description);
      x.setUnitsOnHand(unitsOnHand);
      x.setPrice(price);
      
   } // setter method
   
   private static void getter(RetailItem x) {
      
      // Outputs
      System.out.print("\nDescription: " + x.getDescription());
      System.out.print("\nUnits on Hand: " + x.getUnitsOnHand());
      System.out.print("\nPrice: $" + x.getPrice() + "\n");
      
   }
   
} // End class