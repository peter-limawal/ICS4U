/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Challenges Q5 Larger Than n
*/

public class LargerThanN {
   
   public static void main(String[] args) {
      
      // Declaring arrays
      int[] numbers = new int[20];
      int[] largerNumbers = new int[20];
      
      // Declaring variable
      int n = 1 + (int)(Math.random() * 100);
      
      // Filling in array
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = 1 + (int)(Math.random() * 100);
      }
      
      // Calling largerN method
      largerNumbers = largerN(numbers, n);
      
      // Output
      System.out.printf("The value of n is: %d", n);
      System.out.print("\nThe numbers in the array greater than n are: ");
      for (int j = 0; j < largerNumbers.length; j++) {
         if (largerNumbers[j] != 0) {
            System.out.print(largerNumbers[j] + " ");
         }
      }
      
   } // Main method
   
   private static int[] largerN(int[] numbers, int n) {
      
      // Declaring array
      int[] largerNumbers = new int[numbers.length];
      
      // For loop
      int j = 0;
      for (int i = 0; i < numbers.length; i++) {
         
         if (numbers[i] > n) {
            largerNumbers[j] = numbers[i];
            j++;
         }
         
      }
      
      // Returning largerNumbers array
      return largerNumbers;
      
   } // largerN method
   
} // End class