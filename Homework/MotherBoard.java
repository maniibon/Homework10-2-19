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
    public void loadProgram(String programName){
        System.out.println(programName+"is Now loading");

    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void loadProgram() {
    }
}
