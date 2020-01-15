/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 2 Challenges Q3 Personal Information
*/

import java.util.Scanner; // Import Scanner class

public class PersonalInformation {

   public static void main(String[] args) {

      // Declaring variables
      String name;
      String address;
      String city;
      String state;
      String zip;
      String phoneNum;
      String collegeMajor;

      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);

      // Obtaining name input
      System.out.print("What is your name? : ");
      name = keyboard.nextLine();
      
      // Obtaining address input
      System.out.print("What is your address? : ");
      address = keyboard.nextLine();

      // Obtaining city input
      System.out.print("What city do you live in? : ");
      city = keyboard.nextLine();

      // Obtaining state input
      System.out.print("What state do you live in? : ");
      state = keyboard.nextLine();

      // Obtaining zip input
      System.out.print("What is your ZIP code? : ");
      zip = keyboard.nextLine();

      // Obtaining phoneNum input
      System.out.print("What is your phone number? : ");
      phoneNum = keyboard.nextLine();

      // Obtaining collegeMajor input
      System.out.print("What is your major in college? : ");
      collegeMajor = keyboard.nextLine();

      // Output
      System.out.print("\nName: " + name +
                       "\nAddress: " + address + ", " + city + ", " + state + ", " + zip +
                       "\nPhone Number: " + phoneNum +
                       "\nCollege Major: " + collegeMajor);

   } // Main method

} // End class
