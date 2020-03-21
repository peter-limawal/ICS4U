public class Temperature {
   
   // Declaring variables
   private double ftemp;
   private double ctemp;
   private double ktemp;
   
   public Temperature(double a) {
      
      ftemp = a;
      
   } // Basic constructor
   
   public Temperature(String a) {
      
      ftemp = Double.parseDouble(a);
      
   } // Modified constructor
   
   public Temperature() {
      
      ftemp = 0;
      
   } // No arg constructor
   
   public void setFahrenheit(double a) {
      
      ftemp = a;
      
   } // double ftemp mutator
   
   public void setFahrenheit(String a) {
      
      ftemp = Double.parseDouble(a);
      
   } // String ftemp mutator
   
   public double getFahrenheit() {
      
      return ftemp;
      
   } // ftemp accessor
   
   public void calculateCelcius() {
      
      ctemp = (5.0 / 9.0) * (ftemp - 32);
      
   } // ctemp calculator
   
   public double getCelcius() {
      
      calculateCelcius();
      return ctemp;
      
   } // ctemp accessor
   
   public void calculateKelvin() {
      
      ktemp = ((5.0 / 9.0) * (ftemp - 32)) + 273;
      
   } // ktemp calculator
   
   public double getKelvin() {
      
      calculateKelvin();
      return ktemp;
      
   } // ktemp accessor
   
} // End class