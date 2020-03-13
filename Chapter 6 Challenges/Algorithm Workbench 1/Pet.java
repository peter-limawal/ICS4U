public class Pet {

   private String name;
   private String animal;
   private int age;
   
   public Pet() {
      
      name = "";
      animal = "";
      age = 0;
      
   }
   
   public Pet(String str1, String str2, int num) {
      
      name = str1;
      animal = str2;
      age = num;
      
   }
   
   public Pet(String str1, String str2, String num) {
      
      name = str1;
      animal = str2;
      age = Integer.parseInt(num);
      
   }
   
   public void setName(String str) {
      
      name = str;
      
   }
   
   public void setAnimal(String str) {
      
      animal = str;
      
   }
   
   public void setAge(int num) {
      
      age = num;
      
   }
   
   public void setAge(String num) {
      
      age = Integer.parseInt(num);
      
   }
   
   public String getName() {
      
      return name;
      
   }
   
   public String getAnimal() {
      
      return animal;
      
   }
   
   public int getAge() {
      
      return age;
      
   }
   
}