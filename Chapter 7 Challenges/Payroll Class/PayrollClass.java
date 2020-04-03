/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Challenges Q2 Payroll Class
*/

import java.util.Scanner;

public class PayrollClass {
   
   public static void main(String[] args) {
      
      // Creating object
      Payroll employees = new Payroll();
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // For loop
      for (int i = 0; i < 7; i++) {
         
         // Obtaining employee hours
         System.out.printf("Enter employee %d's hours : ", employees.getEmployeeId(i));
         int h = keyboard.nextInt();
         // Parameter
         while (h < 0) {
            System.out.print("ERROR! Employee hours cannot be negative!");
            System.out.printf("\nEnter employee %d's hours : ", employees.getEmployeeId(i));
            h = keyboard.nextInt();
         }
         employees.setHours(i, h);
         
         // Obtaining employee pay rate
         System.out.printf("Enter employee %d's pay rate : $", employees.getEmployeeId(i));
         double p = keyboard.nextDouble();
         // Parameter
         while (p < 6.00) {
            System.out.print("ERROR! Employee pay rate cannot be less than $6.00!");
            System.out.printf("\nEnter employee %d's pay rate : $", employees.getEmployeeId(i));
            p = keyboard.nextDouble();
         }
         employees.setPayRate(i, p);
         
         // Setting wages
         double w = employees.grossPay(employees.getEmployeeId(i));
         employees.setWages(i, w);
         
      }
      
      // Output
      for (int j = 0; j < 7; j++) {
         
         System.out.printf("\nEmployee ID number: %d", employees.getEmployeeId(j));
         System.out.printf("\nEmployee gross wage: $%,.2f\n", employees.getWages(j));
         
      }
      
   } // Main method
   
} // End class