public class RetailItem {
   
   // Declaring variables
   private String description;
   private int unitsOnHand;
   private double price;
   
   public RetailItem(String a, int b, double c) {
      
      description = a;
      unitsOnHand = b;
      price = c;
      
   } // Basic constructor
   
   public RetailItem(String a, String b, String c) {
      
      description = a;
      unitsOnHand = Integer.parseInt(b);
      price = Double.parseDouble(c);
      
   } // Modified constructor
   
   public RetailItem() {
      
      description = "";
      unitsOnHand = 0;
      price = 0;
      
   } // No arg constructor
   
   public void setDescription(String a) {
      
      description = a;
      
   } // description mutator
   
   public void setUnitsOnHand(int b) {
      
      unitsOnHand = b;
      
   } // int unitsOnHand mutator
   
   public void setUnitsOnHand(String b) {
      
      unitsOnHand = Integer.parseInt(b);
      
   } // String unitsOnHand mutator
   
   public void setPrice(double c) {
      
      price = c;
      
   } // double price mutator
   
   public void setPrice(String c) {
      
      price = Double.parseDouble(c);
      
   } // String price mutator
   
   public String getDescription() {
      
      return description;
      
   } // department accessor
   
   public int getUnitsOnHand() {
      
      return unitsOnHand;
      
   } // unitsOnHand accessor
   
   public double getPrice() {
      
      return price;
      
   } // price accessor
   
} // End class