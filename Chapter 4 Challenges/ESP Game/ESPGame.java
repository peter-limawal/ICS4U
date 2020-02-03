/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q19 ESP Game
*/

import java.util.Scanner;

public class ESPGame {
   
   public static void main(String[] args) {
   
      // Creating array
      String[] colours = {"red", "green", "blue", "orange", "yellow"};
      
      // Declaring variables
      int random;
      int count = 0;
      String guess;
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // For loop
      for (int i = 0; i < 10; i++) {
         
         // Creating random number
         random = (int)(Math.random() * 4);
         
         // Obtaining guess input
         System.out.print("Enter guess (red, green, blue, orange, yellow) : ");
         guess = keyboard.nextLine();
         
         // If statement
         if (guess.equalsIgnoreCase(colours[random])) {
            count++;
         }
         
         // Output
         System.out.println("The correct colour is " + colours[random]);
         
      }
      
      // Output
      System.out.printf("\nYou got %d out of 10!", count);
      
   }
   
}