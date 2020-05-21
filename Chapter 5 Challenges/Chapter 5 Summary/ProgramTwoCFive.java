/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Program Two
*/

import java.util.Scanner;

public class ProgramTwoCFive {
   
   public static void main(String[] args) {
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Declaring variables
      int year, month, date;
      int yearNow, monthNow, dateNow;
      
      // Obtaining input
      System.out.print("What year were you born on? : ");
      year = keyboard.nextInt();
      System.out.print("What month (number) were you born on? : ");
      month = keyboard.nextInt();
      System.out.print("What date were you born on? : ");
      date = keyboard.nextInt();
      System.out.print("What year is it today? : ");
      yearNow = keyboard.nextInt();
      System.out.print("What month is it today? : ");
      monthNow = keyboard.nextInt();
      System.out.print("What date is it today? : ");
      dateNow = keyboard.nextInt();
      
      // Calling daysOld method
      daysOld(year, month, date, yearNow, monthNow, dateNow);
      
   } // Main method
   
                              // Multiple arguments
   private static void daysOld(int year, int month, int date,
                               int yearNow, int monthNow, int dateNow) {
      
      // Declaring variable
      int ageInDays;
      
      // Calculation (Assume all months have 30 days)
      ageInDays = ((yearNow - year) * 365) + ((monthNow - month) * 30) + (dateNow - date);
      
      // Output
      System.out.print("You are approximately " + ageInDays + " days old!");
      
   } // daysOld method
   
} // End class