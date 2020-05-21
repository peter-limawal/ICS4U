/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 7 Program Three
*/

import java.util.Scanner;

public class ProgramThreeCSeven {
   
   public static void main(String[] args) {
      
      // Scanner object for input
      Scanner keyboard = new Scanner(System.in);
      
      // Declaring array
      int[] numbers = new int[100];
      int[] sortedNumbers = new int[100];
      
      // Filling in numbers array with random numbers
      for (int i = 0; i < numbers.length; i++) {
         numbers[i] = (int)(Math.random() * 100);
      }
      
      // Declaring variables
      int testNumber;
      
      // Obtaining testNumber input
      System.out.print("Enter a test number : ");
      testNumber = keyboard.nextInt();
      
      // Output
      System.out.print("The array is: ");
      for (int j = 0; j < numbers.length; j++) {
         System.out.print(numbers[j] + " ");
      }
      
      // Output using seqSearch method
      System.out.print("\nBy using sequential search we can determine that the number " + testNumber);
      if (seqSearch(numbers, testNumber)) {
         System.out.print(" exists in the array");
      } else {
         System.out.print(" does not exist in the array");
      }
      
      // Output using binSearch method
      sortedNumbers = selSort(numbers);
      System.out.print("\nThe sorted array is: ");
      for (int k = 0; k < sortedNumbers.length; k++) {
         System.out.print(sortedNumbers[k] + " ");
      }
      System.out.print("\nBy using binary search we can determine that the number " + testNumber);
      if (binSearch(numbers, testNumber)) {
         System.out.print(" exists in the array");
      } else {
         System.out.print(" does not exist in the array");
      }
      
   } // Main method
   
   // Sequential search algorithm
   private static boolean seqSearch(int[] numbers, int testNumber) {
      
      // For loop
      for (int i = 0; i < numbers.length; i++) {
         // If the number exists in the array
         if (numbers[i] == testNumber) {
            return true;
         }
      }
      
      // Return value if the number does not exist in the array
      return false;
      
   } // seqSearch method
   
   // Selection sort algorithm
   private static int[] selSort(int[] numbers) {
      
      // Declaring variables
      int smallest, smallestIndex, placehold;
      
      // Nested for loops
      for (int i = 0; i < numbers.length - 1; i++) {
         
         // Declaring variables
         smallest = numbers[i];
         smallestIndex = i;
         
         for (int j = i + 1; j < numbers.length; j++) {
            // Comparing values
            if (numbers[j] < smallest) {
               smallest = numbers[j];
               smallestIndex = j;
            }
         }
         
         // Switching indexes
         placehold = numbers[i];
         numbers[i] = numbers[smallestIndex];
         numbers[smallestIndex] = placehold;
         
      }
      
      // Returning the array
      return numbers;
      
   } // selSort method
   
   // Binary search algorithm
   private static boolean binSearch(int[] numbers, int testNumber) {
      
      // Creating a sorted array using selSort method
      int[] sortedNumbers = new int[100];
      sortedNumbers = selSort(numbers);
      
      // Declaring variables
      int startIndex = 0;
      int endIndex = sortedNumbers.length - 1;
      int midpoint;
      boolean verdict = false;
      
      // While loop
      while (verdict == false && startIndex <= endIndex) {
         
         // Calculating midpoint
         midpoint = (startIndex + endIndex) / 2;
         
         // If-else-if statements
         if (sortedNumbers[midpoint] == testNumber) {
            verdict = true;
            return verdict;
         } else if (sortedNumbers[midpoint] > testNumber) {
            endIndex = midpoint - 1;
         } else if (sortedNumbers[midpoint] < testNumber) {
            startIndex = midpoint + 1;
         }
         
      }
      
      // Return value if the number does not exist in the array
      return verdict;
      
   } // binSearch method
   
} // End class