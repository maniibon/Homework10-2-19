package Homework;

  public class FamilyDoctor extends Doctor {
      int makeHouseCalls;

      public FamilyDoctor(int makeHouseCalls) {
          super(1);
          this.makeHouseCalls = makeHouseCalls;


      }

      public void giveadvice(){
          System.out.println ("google it ");
      }
  }