/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Challenges Q21 Dice Game
*/

public class DiceGame {
   
   public static void main(String[] args) {
      
      // Declaring variables
      int compNum;
      int userNum;
      int compCount = 0;
      int userCount = 0;
      String winner;
      
      // For loop
      for (int i = 1; i <= 10; i++) {
         
         compNum = (int)(Math.random() * 5) + 1;
         userNum = (int)(Math.random() * 5) + 1;
         
         if (compNum > userNum) {
            compCount++;
         } else if (userNum > compNum) {
            userCount++;
         }
         
         // Output
         System.out.println("\nRound " + i + ":\nComputer wins: " + compCount + "\nUser wins : " + userCount); 
         
      }
      
      if (compCount > userCount) {
         winner = "Computer";
      } else if (userCount > compCount) {
         winner = "User";
      } else {
         winner = "Tie";
      }
      
      // Output
      System.out.print("\nGrand winner: " + winner + "\nCongratulations!");
      
   }
   
}