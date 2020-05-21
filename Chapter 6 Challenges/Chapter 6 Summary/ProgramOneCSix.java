/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Program One
*/

import java.util.Scanner;

public class ProgramOneCSix {
   
   public static void main(String[] args) {
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Declaring variables
      String name;
      String birthDate;
      String birthMonth;
      String birthYear;
      String favColour;
      
      // Obtaining inputs
      System.out.print("Enter your name : ");
      name = keyboard.nextLine();
      System.out.print("Enter your birth date : ");
      birthDate = keyboard.nextLine();
      System.out.print("Enter your birth month : ");
      birthMonth = keyboard.nextLine();
      System.out.print("Enter your birth year : ");
      birthYear = keyboard.nextLine();
      System.out.print("Enter your favourite colour : ");
      favColour = keyboard.nextLine();
      
      // Creating ProgramOneCSixClass object
      ProgramOneCSixClass personA = new ProgramOneCSixClass(name, birthDate, birthMonth, birthYear, favColour);
      
      // Output
      System.out.print("\nYour name is " + personA.getName());
      System.out.print("\nYou are born on " + personA.getBirthMonth() + " " + personA.getBirthDate() + ", " + personA.getBirthYear());
      System.out.print("\nYour favourite colour is " + personA.getFavColour()); 
      
   } // Main method
   
} // End class