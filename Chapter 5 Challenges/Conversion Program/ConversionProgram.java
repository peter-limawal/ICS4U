/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q8 Conversion Program
*/

import java.util.Scanner;

public class ConversionProgram {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double distance;
      int convert;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining distance input
      System.out.print("Enter a distance in meters: ");
      distance = keyboard.nextDouble();
      
      // Parameter
      while (distance < 0) {
         
         // Reobtaining distance input
         System.out.print("ERROR! Distance cannot be less than zero!");
         System.out.print("\nEnter a distance in meters: ");
         distance = keyboard.nextDouble();
         
      }
      
      // Calling menu method
      menu();
      
      // Obtaining convert input
      System.out.print("\nEnter your choice: ");
      convert = keyboard.nextInt();
      
      // Parameter
      while (convert < 1 || convert > 4) {
         
         // Reobtaing convert input
         System.out.print("\nERROR! Only options 1 - 4!");
         System.out.print("\nEnter your choice: ");
         convert = keyboard.nextInt();
         
      }
      
      // While loop
      while (convert != 4) {
         
         if (convert == 1) {
            showKilometers(distance);
         } else if (convert == 2) {
            showInches(distance);
         } else if (convert == 3) {
            showFeet(distance);
         }
         
         // Calling menu method
         menu();
         
         // Obtaining convert input
         System.out.print("\nEnter your choice: ");
         convert = keyboard.nextInt();
      
         // Parameter
         while (convert < 1 || convert > 4) {
         
            // Reobtaing convert input
            System.out.print("\nERROR! Only options 1 - 4!");
            System.out.print("\nEnter your choice: ");
            convert = keyboard.nextInt();
         
         }
         
      }
      
      if (convert == 4) {
         
         System.out.print("Bye!");
         
      }
      
   } // Main method
   
   private static void showKilometers(double distance) {
      
      // Declaring variable
      double kilometer;
      
      // Calculation
      kilometer = distance * 0.001;
      
      // Output
      System.out.printf(distance + " meters is %.1f kilometers.\n", kilometer);
      
   } // showKilometers method
   
   private static void showInches(double distance) {
      
      // Declaring variable
      double inches;
      
      // Calculation
      inches = distance * 39.37;
      
      // Output
      System.out.printf(distance + " meters is %.1f inches.\n", inches);
      
   } // showInches method
   
   private static void showFeet(double distance) {
      
      // Declaring variable
      double feet;
      
      // Calculation
      feet = distance * 3.281;
      
      // Output
      System.out.printf(distance + " meters is %.1f feet.\n", feet);
      
   } // showFeet method
   
   private static void menu() {
      
      // Options
      System.out.print("\n1. Convert to kilometer");
      System.out.print("\n2. Convert to inches");
      System.out.print("\n3. Convert to feet");
      System.out.print("\n4. Quit the program\n");
      
   } // Menu method
   
} // End class