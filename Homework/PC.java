package Homework;

public class PC {

   private Case cAse;
    private MotherBoard motherBoard ;
   private Monitor monitor;

   public PC (Case cAse, MotherBoard motherBoard, Monitor monitor) {
        this.monitor = monitor;
        this.motherBoard = motherBoard;
      this.cAse = cAse;
    }

   public Case getcAse() {
       return cAse;
    }

    public void setcAse(Case cAse) {
      this.cAse = cAse;
   }

   public void getMotherBoard() {
  }

   public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
   }

  public Monitor getMonitor() {
      return monitor;
    }

    public void setMonitor(Monitor monitor) {
       this.monitor = monitor;
   }

   private void drawLogo() {
      drawPixel();
 }

    private void drawPixel() {
   }

   public void description(Monitor monitor,MotherBoard motherBoard,Case cAse) {

       System.out.println ();

   }
   private void description(){

   }
    public void poweUp() {
        cAse.pressPowerButton ();
        drawLogo ();



monitor.drawPixelAt(1100, 89, "blue");
}

   }









