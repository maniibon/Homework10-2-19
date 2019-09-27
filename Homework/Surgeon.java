package Homework;

   public class Surgeon extends Doctor {
       int makeHouseCalls;

       public Surgeon(int makeHouseCalls){
           super (1);
           this.makeHouseCalls =makeHouseCalls;

       }

       @Override
       public void treatPatient() {
           super.treatPatient ();
       }


      public void makeIncision(){
          System.out.println (1);
}



}