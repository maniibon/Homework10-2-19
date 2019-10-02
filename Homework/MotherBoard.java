package Homework;


public class MotherBoard{
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int  cardSlots;
    private String bios;

    public MotherBoard (String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }


    public void loadProgram (String programName){
        System.out.println(programName+" is Now loading");

    }

    public MotherBoard() {
        super ();
    }

    @Override
    public int hashCode() {
        return super.hashCode ();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals ( obj );
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone ();
    }

    @Override
    public String toString() {
        return super.toString ();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize ();
    }
}
