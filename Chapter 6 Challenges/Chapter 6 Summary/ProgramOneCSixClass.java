/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 6 Program One Class
*/

public class ProgramOneCSixClass {
   
   // Declaring instance fields
   private String name;
   private int birthDate;
   private String birthMonth;
   private int birthYear;
   private String favColour;
   
   public ProgramOneCSixClass(String a,
                              int b,
                              String c,
                              int d,
                              String e) {
      
      name = a;
      birthDate = b;
      birthMonth = c;
      birthYear = d;
      favColour = e;
                                 
   } // Basic constructor
   
   // In case all of the input is in String format (JOptionPane or Scanner)
   public ProgramOneCSixClass(String a,
                              String b,
                              String c,
                              String d,
                              String e) {
      
      name = a;
      birthDate = Integer.parseInt(b);
      birthMonth = c;
      birthYear = Integer.parseInt(d);
      favColour = e;
                                 
   } // Modified constructor
   
   // In case the object is created without any arguments
   public ProgramOneCSixClass() {
      
      name = "";
      birthDate = 0;
      birthMonth = "";
      birthYear = 0;
      favColour = "";
      
   } // No arg constructor
   
   /*
   The following accessors are created in order to prove that 
   the object also contains the data from the main Java file. 
   */
   
   public String getName() {
      
      return name;
      
   } // name accessor
   
   public int getBirthDate() {
      
      return birthDate;
      
   } // birthDate accessor
   
   public String getBirthMonth() {
      
      return birthMonth;
      
   } // birthMonth accessor
   
   public int getBirthYear() {
      
      return birthYear;
      
   } // birthYear accessor
   
   public String getFavColour() {
      
      return favColour;
      
   } // favColour accessor
   
} // End class