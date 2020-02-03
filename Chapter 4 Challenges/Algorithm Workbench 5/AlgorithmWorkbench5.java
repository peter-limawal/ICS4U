/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Algorithm Workbench Q5
*/

public class AlgorithmWorkbench5 {
   
   public static void main(String[] args) {
      
      // Declaring variables
      double number = 30;
      double sum = 0;
      
      // For loop
      for (double i = 1; i < 30; i++) {
         
         sum += (number / i);
         number--;
         
      }
      
      // Output
      System.out.print(sum);
      
   }
   
}