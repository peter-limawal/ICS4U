/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 16 Program One
*/

public class ProgramOneCSixteen {
   
   public static void main(String[] args) {
      
      // Calling numberPrinter method
      numberPrinter(10);
      
   } // Main method
   
   private static void numberPrinter(int num) {
      
      // Parameter
      if (num > 0) {
      
         for (int i = 0; i < num; i++) {
            System.out.print(num + " ");
         }
         
         System.out.println();
         
         // Recursive call
         //          Decrement the number
         numberPrinter(num - 1);
         
      }
      
   }
   
} // End class