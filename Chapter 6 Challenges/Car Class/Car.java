public class Car {
   
   // Declaring variables
   private int yearModel;
   private String make;
   private int speed;
   
   public Car(int a, String b) {
      
      yearModel = a;
      make = b;
      speed = 0;
      
   } // Main constructor
   
   public int getYearModel() {
      
      return yearModel;
      
   } // yearModel accessor
   
   public String getMake() {
      
      return make;
      
   } // make accessor
   
   public int getSpeed() {
      
      return speed;
      
   } // speed accessor
   
   public void accelerate() {
      
      speed += 5;
      
   } // accelerate method
   
   public void brake() {
      
      speed -= 5;
      
   } // brake method
   
} // End class