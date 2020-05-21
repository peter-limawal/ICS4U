/*
Peter Paul Limawal
2019084007
ICS4U-S2 - Period 5
Chapter 5 Program Two Class
*/

public class ProgramTwoCSixClass {
   
   // Declaring instance fields
   private String uniName;
   private String uniLocation;
   private int yearEstablished;
   private String uniMotto;
   
   public ProgramTwoCSixClass(String a, String b, int c, String d) {
      
      uniName = a;
      uniLocation = b;
      yearEstablished = c;
      uniMotto = d;
      
   } // Basic constructor
   
   // In case all of the input is in String format (JOptionPane or Scanner)
   public ProgramTwoCSixClass(String a, String b, String c, String d) {
      
      uniName = a;
      uniLocation = b;
      yearEstablished = Integer.parseInt(c);
      uniMotto = d;
      
   } // Modified constructor
   
   // In case the object is created without any arguments
   public ProgramTwoCSixClass() {
      
      uniName = "";
      uniLocation = "";
      yearEstablished = 0;
      uniMotto = "";
      
   } // No arg constructor
   
   public void setUniName(String a) {
      
      uniName = a;
      
   } // uniName mutator
   
   public void setUniLocation(String b) {
      
      uniLocation = b;
      
   } // uniLocation mutator
   
   public void setYearEstablished(int c) {
      
      yearEstablished = c;
      
   } // int yearEstablished mutator
   
   public void setYearEstablished(String c) {
      
      yearEstablished = Integer.parseInt(c);
      
   } // String yearEstablished mutator
   
   public void setUniMotto(String d) {
      
      uniMotto = d;
      
   } // uniMotto mutator
   
   public String getUniName() {
      
      return uniName;
      
   } // uniName accessor
   
   public String getUniLocation() {
      
      return uniLocation;
      
   } // uniLocation accessor
   
   public int getYearEstablished() {
      
      return yearEstablished;
      
   } // yearEstablished accessor
   
   public String getUniMotto() {
      
      return uniMotto;
      
   } // uniMotto accessor
   
   // Calculator method to obtain the age of the university
   public int calculateUniAge(int x) {
      
      // Declaring variable and calculating
      int uniAge = x - yearEstablished;
      
      // Returning uniAge after calculation
      return uniAge;
      
   } // calulateUniAge method
   
} // End class