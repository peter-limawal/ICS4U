public class MrNadasQuestion {
   
   public static void main(String[] args) {
     
      for (int i = 2; i < 1000; i++) {
         
         boolean verdict = isPrime(i);
         if (verdict) {
            System.out.print(i + " ");
         }
         
      }
      
   }
   
   private static boolean isPrime(int num) {
      
      for (int i = 2; i <= (int)Math.sqrt(num); i++) {
         if (num % i == 0) {return false;}
      }
      
      return true;
      
   }
   
}