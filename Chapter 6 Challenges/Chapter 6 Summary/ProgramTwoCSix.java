/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Program Two
*/

import java.util.Scanner;

public class ProgramTwoCSix {
   
   public static void main(String[] args) {
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Creating ProgramTwoCSixClass objects
      ProgramTwoCSixClass uWaterloo = new ProgramTwoCSixClass("University of Waterloo", "Waterloo, Ontario", 2020, "In harmony with truth");
      ProgramTwoCSixClass uToronto = new ProgramTwoCSixClass("University of Toronto", "Toronto, Ontario", 2020, "As a tree through the ages");
      ProgramTwoCSixClass mcMaster = new ProgramTwoCSixClass("McMaster University", "Hamilton, Ontario", 2020, "In Christ all things consist");
      
      // Using mutators to change the yearEstablished fields
      System.out.print("When was UWaterloo established? : ");
      uWaterloo.setYearEstablished(keyboard.nextLine());
      System.out.print("When was UToronto established? : ");
      uToronto.setYearEstablished(keyboard.nextLine());
      System.out.print("When was McMaster established? : ");
      mcMaster.setYearEstablished(keyboard.nextLine());
      
      // Calling outputCreator method for output
      outputCreator(uWaterloo);
      outputCreator(uToronto);
      outputCreator(mcMaster);
      
   } // Main method
   
   private static void outputCreator(ProgramTwoCSixClass x) {
      
      // Using accessors and calculator to create university profile output
      System.out.print("\n\n" + x.getUniName() + " is a university located in " + x.getUniLocation() + ".");
      System.out.print("\nEstablished in " + x.getYearEstablished() + ", it is now " + x.calculateUniAge(2020) + " years old.");
      System.out.print("\nThe university's motto is \"" + x.getUniMotto() + "\".");
      
   } // outputCreator method
   
} // End class