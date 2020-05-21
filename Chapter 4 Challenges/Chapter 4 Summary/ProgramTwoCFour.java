/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 4 Program Two
*/

import java.util.Scanner;
import java.io.*;

public class ProgramTwoCFour {
   
   public static void main(String[] args) throws IOException {
      
      // Reading file
      File fileIn = new File("PTCFInput.txt");
      Scanner st = new Scanner(fileIn);
      
      // Opening and writing file
      File fileOut = new File("PTFCOutput.txt");
      PrintWriter out = new PrintWriter(fileOut);
      
      // While loop
      while (st.hasNext()) {
         
         // Declaring variables
         String original = st.nextLine();
         String update = "";
         
         // Removing vowels
         for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != 'A' &&
                original.charAt(i) != 'E' &&
                original.charAt(i) != 'I' &&
                original.charAt(i) != 'O' &&
                original.charAt(i) != 'U' &&
                original.charAt(i) != 'a' &&
                original.charAt(i) != 'e' &&
                original.charAt(i) != 'i' &&
                original.charAt(i) != 'o' &&
                original.charAt(i) != 'u') {
                  
                  update += original.charAt(i);
                  
                }
         }
         
         // Writing into file
         out.println(update);
         
      }
      
      out.close();
      
   } // Main method
   
} // End class