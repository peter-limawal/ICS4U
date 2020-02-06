/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q22 Slot Machine Simulation
*/

import java.util.Scanner;

public class SlotMachineSimulation {
   
   public static void main(String[] args) {
      
      // Declaring variables
      String verdict;
      double money = 0;
      double tally = 0;
      double initial = 0;
      int random;
      String word ="";
      String object1 = "";
      String object2 = "";
      String object3 = "";
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Obtaining verdict input
      System.out.print("Would you like to play a game? (Yes/No) : ");
      verdict = keyboard.nextLine();
      
      // Parameters
      while (verdict.equalsIgnoreCase("yes") == false && verdict.equalsIgnoreCase("no") == false) {
         
         // Reobtaining verdict input
         System.out.print("ERROR! Input can only be yes or no!");
         System.out.print("\nWould you like to play a game? (Yes/No) : ");
         verdict = keyboard.nextLine();
         
      }
      
      if (verdict.equalsIgnoreCase("yes")) {
      
      // Obtaining initial input
         System.out.print("Enter the initial amount of money you have : ");
         initial = keyboard.nextInt();
      
      // Parameters
         while (initial <= 0) {
         
         // Reobtaining tally input
            System.out.print("ERROR! Initial money must be more than zero!");
            System.out.print("\nEnter the initial amount of money you have : ");
            initial = keyboard.nextInt();
         
         }
         
         tally = initial;
      
      }
      
      while (verdict.equalsIgnoreCase("yes") && tally > 0) {
      
         // Obtaining money input
         System.out.print("Enter amount of money you want to bet: ");
         money = keyboard.nextDouble();
         
         // Parameter to not bet more than the amount of money owned
         while (money > tally) {
            System.out.print("ERROR! You don't have enough money!");
            System.out.print("\nEnter amount of money you want to bet: ");
            money = keyboard.nextDouble();
         }
         
         tally -= money;
         
         // For loop
         for (int i = 1; i <= 3; i++) {
         
            // Creating random numbers
            random = (int)(Math.random() * 5);
            
            // Switch cases
            switch (random) {
               case 0:
                  word = "Cherries";
                  break;
               case 1:
                  word = "Oranges";
                  break;
               case 2:
                  word = "Plums";
                  break;
               case 3:
                  word = "Bells";
                  break;
               case 4:
                  word = "Melons";
                  break;
               case 5:
                  word = "Bars";
                  break;
            }
            
            // Assigning objects
            if (i == 1) {
               object1 = word;
            } else if (i == 2) {
               object2 = word;
            } else if (i == 3) {
               object3 = word;
            }
            
         }
         
         // Output
         System.out.print(object1 + "   " + object2 + "   " + object3);
         
         // Double multiplier
         if (object1 == object2 || object2 == object3 || object1 == object3) {
            tally += (money * 2);
            System.out.print("\nYou have earned two times the amount entered!");
         }
         
         // Triple multiplier
         else if (object1 == object2 && object2 == object3) {
            tally += (money * 3);
            System.out.print("\nJACKPOT! You have earned three times the amount entered!");
         }
         
         // Zero multiplier
         else {
            System.out.print("\nSorry! You have earned $0");
         }
         
         // Reobtaining verdict input
         System.out.print("\n\nWould you like to play another game? (Yes/No) : ");
         keyboard.nextLine();
         verdict = keyboard.nextLine();
         
         while (verdict.equalsIgnoreCase("yes") == false && verdict.equalsIgnoreCase("no") == false) {
         
         // Reobtaining verdict input
            System.out.print("ERROR! Input can only be yes or no!");
            System.out.print("\nWould you like to play a game? (Yes/No) : ");
            verdict = keyboard.nextLine();
         
         }
         
      } if (tally <= 0) {
         // Output
         System.out.print("Sorry! Game over!");
      }
      
      // Output
      System.out.println();
      System.out.printf("\nYou entered : $%.2f", initial);
      System.out.printf("\nYou have won : $%.2f", tally);
      
   } // Main method
   
} // End class