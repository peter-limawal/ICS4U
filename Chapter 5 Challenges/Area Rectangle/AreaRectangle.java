/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Challenges Q3 Area Rectangle
*/

import java.util.Scanner;

public class AreaRectangle {
   
   public static void main(String[] args) {
      
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
      
   } // Main method
   
   private static double getLength() {
   
      // Declaring variable
      double length;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining length input
      System.out.print("Enter length of rectangle (cm) : ");
      length = keyboard.nextDouble();
      
      // Returning length
      return length;
      
   } // getLength method
   
   private static double getWidth() {
   
      // Declaring variable
      double width;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining width input
      System.out.print("Enter width of rectangle (cm) : ");
      width = keyboard.nextDouble();
      
      // Returning width
      return width;
      
   } // getWidth method
   
   private static double getArea(double length, double width) {
      
      // Declaring variable
      double area;
      
      // Calculation
      area = length * width;
      
      // Returning area
      return area;
      
   } // getArea method
   
   private static void displayData(double length, double width, double area) {
      
      // Output
      System.out.printf("\nLength of rectangle : %.2f cm", length);
      System.out.printf("\nWidth of rectangle : %.2f cm", width);
      System.out.printf("\nArea of rectangle : %.2f cm^2", area);
      
   }
   
} // End class