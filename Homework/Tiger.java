package Homework;

 public class Tiger extends Animal {
     public Tiger(String TypeofFood) {
         super ( TypeofFood );
     }

     @Override
    public  String eats(){
        return "red meat";
    }
}
