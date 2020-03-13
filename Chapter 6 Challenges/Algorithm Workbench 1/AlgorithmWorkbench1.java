/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Algorithm Workbench Q1
*/

import java.util.Scanner;

public class AlgorithmWorkbench1 {
   
   public static void main(String[] args) {
      
      // Declaring variables
      String name;
      String animal;
      String age;
      
      // Creating object
      Pet randy = new Pet();
      Pet stephen = new Pet("Stephen", "Sheep", 17);
      Pet dave = new Pet("Dave", "Rock", "10");
      
      // Calling setter method
      setter(randy);
      
      // Calling getter method
      getter(randy);
      getter(stephen);
      getter(dave);
      
   } // Main method
   
   private static void setter(Pet x) {
   
      // Declaring variable
      String name;
      String animal;
      String age;
   
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining inputs
      System.out.print("Enter pet name : ");
      name = keyboard.nextLine();
      System.out.print("Enter animal type : ");
      animal = keyboard.nextLine();
      System.out.print("Enter pet age : ");
      age = keyboard.nextLine();
      
      x.setName(name);
      x.setAnimal(animal);
      x.setAge(age);
      
   } // setter method
   
   private static void getter(Pet x) {
      
      System.out.print("\n" + x.getName() + ", ");
      System.out.print(x.getAnimal() + ", ");
      System.out.print(x.getAge());
      
   } // getter method
   
} // End class