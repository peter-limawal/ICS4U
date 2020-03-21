/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Challenges Q8 Temperature Class
*/

import java.util.Scanner;

public class TemperatureClass {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double ftemp;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining ftemp input
      System.out.print("Enter a temperature in Fahrenheit : ");
      ftemp = keyboard.nextDouble();
      
      // Creating object
      Temperature a = new Temperature(ftemp);
      
      // Output
      System.out.printf("\nThe temperature in Celcius is: %.2f", a.getCelcius());
      System.out.printf("\nThe temperature in Kelvin is: %.2f\n", a.getKelvin());
      
   } // Main method
   
} // End class