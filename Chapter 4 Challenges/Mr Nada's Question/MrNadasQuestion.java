/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Mr Nada's Question
*/

public class MrNadasQuestion {
   
   public static void main(String[] args) {
   
      // Declaring variables
      String output;
      
      for (int i = 1; i <= 50; i++) {
      
         output = i + ": ";
         
         for (int j = 1; j <= i; j++) {
         
            if (i % j == 0) {
            
               output += j + " ";
            
            }
         
         }
         
         System.out.println(output);
         
      }
      
      
   }
   
}
