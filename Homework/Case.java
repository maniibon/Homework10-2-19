package Homework;

public class Case {
    String Model;
    String Manufacturer;
    String PowerSupply;
    Dimensions dimensions;

    public Case (String Model, String Manufacturer, String PowerSupply,Dimensions dimensions) {
    this.Model= Model;
    this.Manufacturer = Manufacturer;
    this.PowerSupply= PowerSupply;
    this.dimensions= dimensions;
}
    public void pressPowerButton(){
        System.out.println("Power Button Pressed");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

