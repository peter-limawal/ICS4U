public class FreezingBoiling {
   
   // Declaring variables
   private double temperature;
   
   public FreezingBoiling(double a) {
      
      temperature = a;
      
   } // Basic constructor
   
   public FreezingBoiling(String a) {
      
      temperature = Double.parseDouble(a);
      
   } // Modified constructor
   
   public FreezingBoiling() {
      
      temperature = 0;
      
   } // No arg constructor
   
   public void setTemperature(double a) {
      
      temperature = a;
      
   } // double temperature mutator
   
   public void setTemperature(String a) {
      
      temperature = Double.parseDouble(a);
      
   } // String temperature mutator
   
   public double getTemperature() {
      
      return temperature;
      
   } // temperature accessor
   
   public boolean isEthylFreezing() {
      
      if (temperature <= -173) {
         return true;
      } else {
         return false;
      }
      
   } // isEthylFreezing method
   
   public boolean isEthylBoiling() {
      
      if (temperature >= 172) {
         return true;
      } else {
         return false;
      }
      
   } // isEthylBoiling method
   
   public boolean isOxygenFreezing() {
      
      if (temperature <= -362) {
         return true;
      } else {
         return false;
      }
      
   } // isOxygenFreezing method
   
   public boolean isOxygenBoiling() {
      
      if (temperature >= -306) {
         return true;
      } else {
         return false;
      }
      
   } // isOxygenBoiling method
   
   public boolean isWaterFreezing() {
      
      if (temperature <= 32) {
         return true;
      } else {
         return false;
      }
      
   } // isWaterFreezing method
   
   public boolean isWaterBoiling() {
      
      if (temperature >= 212) {
         return true;
      } else {
         return false;
      }
      
   } // isWaterBoiling method
   
} // End class