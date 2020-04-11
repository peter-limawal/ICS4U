/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Challenges Q13 Name Search
*/

import java.util.Scanner;
import java.io.*;

public class NameSearch {
   
   public static void main(String[] args) throws IOException {
      
      // Declaring arrays
      String[] girlNames = new String[200];
      String[] boyNames = new String[200];
      
      // Reading files
      File fileGirl = new File("GirlNames.txt");
      Scanner stG = new Scanner(fileGirl);
      File fileBoy = new File("BoyNames.txt");
      Scanner stB = new Scanner(fileBoy);
      
      // Filling in arrays
      for (int i = 0; i < girlNames.length; i++) {
         girlNames[i] = stG.nextLine();
      }
      for (int j = 0; j < boyNames.length; j++) {
         boyNames[j] = stB.nextLine();
      }
      
      // Declaring variable
      String name;
      String gender;
      boolean verdictG = false;
      boolean verdictB = false;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining gender input
      System.out.print("What gender's name would you like to check (girl/boy/both) : ");
      gender = keyboard.nextLine();
      gender = gender.toLowerCase();
      
      // Parameter
      while (!gender.equals("girl") && !gender.equals("boy") && !gender.equals("both")) {
         System.out.print("ERROR! The database only contains girl and boy names!");
         System.out.print("\nWhat gender's name would you like to check (girl/boy/both) : ");
         gender = keyboard.nextLine();
         gender = gender.toLowerCase();
      }
      
      // Obtaining name input
      System.out.print("Please enter name to be checked : ");
      name = keyboard.nextLine();
      
      // If-else-if statements
      if (gender.equals("girl")) {
         verdictG = girlNameCheck(girlNames, name);
      } else if (gender.equals("boy")) {
         verdictB = boyNameCheck(boyNames, name);
      } else if (gender.equals("both")) {
         verdictG = girlNameCheck(girlNames, name);
         verdictB = boyNameCheck(boyNames, name);
      }
      
      // Output
      if (verdictG == true && verdictB == false) {
         System.out.print("\nThe name " + name + " is in the top 200 girl names list!");
      } else if (verdictG == false && verdictB == true) {
         System.out.print("\nThe name " + name + " is in the top 200 boy names list!");
      } else if (verdictG == true && verdictB == true) {
         System.out.print("\nThe name " + name + " is in the top 200 for both girl and boy names lists!");
      } else if (verdictG == false && verdictB == false) {
         System.out.print("\nThe name " + name + " is not in the top 200 for both girl and boy names lists!");
      }
      
   } // Main method
   
   private static boolean girlNameCheck(String[] girlNames, String name) {
      
      // For loop
      for (int i = 0; i < girlNames.length; i++) {
         if (girlNames[i].equals(name)) {
            return true;
         }
      }
      
      // If none of the names match
      return false;
      
   } // girlNameCheck method
   
   private static boolean boyNameCheck(String[] boyNames, String name) {
      
      // For loop
      for (int i = 0; i < boyNames.length; i++) {
         if (boyNames[i].equals(name)) {
            return true;
         }
      }
      
      // If none of the names match
      return false;
      
   } // boyNameCheck method
   
} // End class