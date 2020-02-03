/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q22 Slot Machine Simulation
*/

import java.util.Scanner;

public class SlotMachineSimulation {
   
   public static void main(String[] args) {
      
      // Creating array
      String[] words = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
      
      // Declaring variables
      String verdict;
      double money = 0;
      double initial = 0;
      double tally = 0;
      int random1, random2, random3;
      String object1, object2, object3;
      
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
      
      while (verdict.equalsIgnoreCase("yes")) {
      
         // Obtaining money input
         System.out.print("Enter amount of money : ");
         money = keyboard.nextDouble();
         initial += money;
         
         // Creating random numbers
         random1 = (int)(Math.random() * 5);
         random2 = (int)(Math.random() * 5);
         random3 = (int)(Math.random() * 5);
         
         // Output
         object1 = words[random1];
         object2 = words[random2];
         object3 = words[random3];
         System.out.print(object1 + "   " + object2 + "   " + object3);
         
         // Double multiplier
         if (object1 == object2 || object2 == object3 || object1 == object3) {
            money *= 2;
            System.out.print("\nYou have earned two times the amount entered!");
         }
         
         // Triple multiplier
         else if (object1 == object2 && object2 == object3) {
            money *= 3;
            System.out.print("\nJACKPOT! You have earned three times the amount entered!");
         }
         
         // Zero multiplier
         else {
            money = money;
            System.out.print("\nSorry! You have earned $0");
         }
         
         tally += money;
         
         // Output
         System.out.printf("\nYour earnings for this round : $%.2f", money);
         
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
         
      }
      
      // Output
      System.out.println();
      System.out.printf("\nYou entered : $%.2f", initial);
      System.out.printf("\nYou have won : $%.2f", (tally - initial));
      
   }
   
}