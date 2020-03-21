/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Challenges Q1 Employee Class
*/

import java.util.Scanner;

public class EmployeeClass {
   
   public static void main(String[] args) {
      
      // Declaring variables
      String name;
      int idNumber;
      String department;
      String position;
      
      // Creating objects
      Employee a = new Employee();
      Employee b = new Employee("Mark Jones", 39119, "IT", "Programmer");
      Employee c = new Employee("Joy Rogers", 81774);
      
      // Calling setter method
      setter(a);
      
      // Calling mutators for object b
      c.setDepartment("Manufacturing");
      c.setPosition("Engineer");
      
      // Calling getter method
      getter(a);
      getter(b);
      getter(c);
      
   } // Main method
   
   private static void setter(Employee x) {
      
      // Declaring variables
      String name;
      String idNumber;
      String department;
      String position;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining inputs
      System.out.print("Enter name : ");
      name = keyboard.nextLine();
      System.out.print("Enter idNumber : ");
      idNumber = keyboard.nextLine();
      System.out.print("Enter department : ");
      department = keyboard.nextLine();
      System.out.print("Enter position : ");
      position = keyboard.nextLine();
      
      x.setName(name);
      x.setIdNumber(idNumber);
      x.setDepartment(department);
      x.setPosition(position);
      
   } // setter method
   
   private static void getter(Employee x) {
      
      System.out.print("\nName : " + x.getName());
      System.out.print("\nID number : " + x.getIdNumber());
      System.out.print("\nDepartment : " + x.getDepartment());
      System.out.println("\nPosition : " + x.getPosition());
      
   } // getter method
   
} // End class