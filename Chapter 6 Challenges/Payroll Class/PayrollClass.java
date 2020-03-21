/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Challenges Q5 Payroll Class
*/

import java.util.Scanner;

public class PayrollClass {
   
   public static void main(String[] args) {
      
      // Declaring variables
      String employeeName;
      String idNumber;
      double hourlyPayRate;
      int numberOfHours;
      
      // Creating objects
      Payroll a = new Payroll("Ray", "20XX08XX01");
      Payroll b = new Payroll("Michael", "20XX08XX18");
      
      // Calling setter method
      setter(a);
      setter(b);
      
      // Calling getter method
      getter(a);
      getter(b);
      
   } // Main method
   
   private static void setter(Payroll x) {
      
      // Declaring variables
      String hourlyPayRate;
      String numberOfHours;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining inputs
      System.out.print("Enter hourly pay rate for " + x.getEmployeeName() + " : ");
      hourlyPayRate = keyboard.nextLine();
      System.out.print("Enter number for hours worked for " + x.getEmployeeName() + " : ");
      numberOfHours = keyboard.nextLine();
      
      x.setHourlyPayRate(hourlyPayRate);
      x.setNumberOfHours(numberOfHours);
      
   } // setter method
   
   private static void getter(Payroll x) {
      
      // Outputs
      System.out.print("\nName: " + x.getEmployeeName());
      System.out.print("\nID Number: " + x.getIdNumber());
      System.out.print("\nGross Pay: $" + x.getGrossPay() + "\n");
      
   } // getter method
   
} // End class