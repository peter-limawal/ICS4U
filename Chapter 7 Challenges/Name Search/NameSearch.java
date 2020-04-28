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
      
      // If gender chosen is girl
      if (gender.equals("girl")) {
         verdictG = girlNameCheck(girlNames, name);
         
         if (verdictG == true) {
            System.out.print("\nThe name " + name + " is in the top 200 girl names list!");
         } else if (verdictG == false) {
            System.out.print("\nThe name " + name + " is not in the top 200 girl names list!");
         }
      }
      
      // If gender chosen is boy
      else if (gender.equals("boy")) {
         verdictB = boyNameCheck(boyNames, name);
         
         if (verdictB == true) {
            System.out.print("\nThe name " + name + " is in the top 200 boy names list!");
         } else if (verdictB == false) {
            System.out.print("\nThe name " + name + " is not in the top 200 boy names list!");
         }
      }
      
      // If gender chosen is both
      else if (gender.equals("both")) {
         verdictG = girlNameCheck(girlNames, name);
         verdictB = boyNameCheck(boyNames, name);
         
         if (verdictG == true && verdictB == false) {
            System.out.print("\nThe name " + name + " is in the top 200 girl names list!");
         } else if (verdictG == false && verdictB == true) {
            System.out.print("\nThe name " + name + " is in the top 200 boy names list!");
         } else if (verdictG == true && verdictB == true) {
            System.out.print("\nThe name " + name + " is in the top 200 for both girl and boy names lists!");
         } else if (verdictG == false && verdictB == false) {
           System.out.print("\nThe name " + name + " is not in the top 200 for both girl and boy names lists!");
         }
      }
      
      // Calling alphabetSort method
      alphabetSort(boyNames, girlNames);
      
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
   
   private static void alphabetSort(String[] boyNames, String[] girlNames) throws IOException {
      
      // Declaring variables
      boolean verdict;
      
      // Sorting algorithm boyNames
      for (int i = 0; i < boyNames.length - 1; i++) {
         String word = boyNames[i]; // Initial word for comparison
         int index = i; // Initial word index
         // For loop to find the smallest word alphabetically
         for (int j = i + 1; j < boyNames.length; j++) {
            // Calling verdict method
            verdict = comparingWords(word, boyNames[j]);
            // If verdict is true, then a comes after b
            if (verdict) {
               word = boyNames[j]; // New word to compare to is b
               index = j; // Index of b
            }
         }
         // Switching positions of word at index i and smallest word
         String temp = boyNames[i];
         boyNames[i] = boyNames[index];
         boyNames[index] = temp;
      }
      
      // Sorting algortihm girlNames
      for (int k = 0; k < girlNames.length - 1; k++) {
         String word = girlNames[k]; // Initial word for comparison
         int index = k; // Initial word index
         // For loop to find the smallest word alphabetically
         for (int l = k + 1; l < girlNames.length; l++) {
            // Calling verdict method
            verdict = comparingWords(word, girlNames[l]);
            // If verdict is true, then a comes after b
            if (verdict) {
               word = girlNames[l]; // New word to compare to is b
               index = l; // Index of b
            }
         }
         // Switching positions of word at index i and smallest word
         String temp = girlNames[k];
         girlNames[k] = girlNames[index];
         girlNames[index] = temp;
      }
      
      // Opening and writing files
      File fileB = new File("SortedBoyNames.txt");
      PrintWriter outB = new PrintWriter(fileB);
      
      File fileG = new File("SortedGirlNames.txt");
      PrintWriter outG = new PrintWriter(fileG);
      
      // Printing files
      outB.print("Sorted Boy Names:");
      for (int m = 1; m <= boyNames.length; m++) {
         outB.print("\n" + m + ". " + boyNames[m - 1]);
      }
      outB.close();
      
      outG.print("Sorted Girl Names:");
      for (int n = 1; n <= girlNames.length; n++) {
         outG.print("\n" + n + ". " + girlNames[n - 1]);
      }
      outG.close();
      
   } // alphabetSort method
   
   private static boolean comparingWords(String a, String b) {
      
      // Declaring variable
      boolean verdict = true; // Assume a comes after b
      int length;
      
      // Setting toLowerCase for a and b
      a = a.toLowerCase();
      b = b.toLowerCase();
      
      // Obtaining length variable
      if (a.length() > b.length()) {
         length = b.length();
      } else {
         length = a.length();
      }
      
      // Comparison algorithm
      for (int i = 0; i < length; i++) {
         // If a comes before b
         if (a.charAt(i) < b.charAt(i)) {
            // Returning false
            return false;
         }
         // If a comes after b
         else if (a.charAt(i) > b.charAt(i)) {
            // Returning true
            return true;
         }
      }
      
      /*
      Edge Cases:
      If the letters are same until last letter of shortest word,
      then the shorter word comes before the longer word
      */
      String wordA = a.substring(0, length);
      String wordB = b.substring(0, length);
      if (wordA.equals(wordB)) {
         // If word a is shorter than word b
         if (a.length() < b.length()) {
            verdict =  false;
         }
      }
      
      // Returning verdict
      return verdict;
      
   } // comparingWords method
   
} // End class