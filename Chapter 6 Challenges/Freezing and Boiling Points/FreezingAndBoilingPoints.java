/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Challenges Q11 Freezing and Boiling Points
*/

import java.util.Scanner;

public class FreezingAndBoilingPoints {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double temperature;
      String output = "";
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining temperature input
      System.out.print("Enter a temperature in Fahrenheit : ");
      temperature = keyboard.nextDouble();
      
      // Creating object
      FreezingBoiling a = new FreezingBoiling(temperature);
      
      // Outputs
      output += "Substances that will freeze:";
      if (a.isEthylFreezing()) {output += " ethyl ";}
      if (a.isOxygenFreezing()) {output += " oxygen ";}
      if (a.isWaterFreezing()) {output += " water ";}
      output += "\nSubstances that will boil:";
      if (a.isEthylBoiling()) {output += " ethyl ";}
      if (a.isOxygenBoiling()) {output += " oxygen ";}
      if (a.isWaterBoiling()) {output += " water ";}
      System.out.print(output);
      
   } // Main method
   
} // End class