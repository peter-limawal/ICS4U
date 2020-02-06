/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q19 ESP Game
*/

import java.util.Scanner;

public class ESPGame {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int random;
      int count = 0;
      String guess;
      String colour = "";
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // For loop
      for (int i = 1; i <= 10; i++) {
         
         // Creating random number
         random = (int)(Math.random() * 4);
         
         // Switch cases
         switch (random) {
            case 0:
               colour = "red";
               break;
            case 1:
               colour = "green";
               break;
            case 2:
               colour = "blue";
               break;
            case 3:
               colour = "orange";
               break;
            case 4:
               colour = "yellow";
               break;
         }
         
         // Obtaining guess input
         System.out.printf("Enter guess %d (red, green, blue, orange, yellow) : ", i);
         guess = keyboard.nextLine();
         
         // If statement
         if (guess.equalsIgnoreCase(colour)) {
            count++;
         }
         
         // Output
         System.out.println("The correct colour is " + colour);
         
      }
      
      // Output
      System.out.printf("\nYou got %d out of 10!", count);
      
   } // Main method
   
} // End class