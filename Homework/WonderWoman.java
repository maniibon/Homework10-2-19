package Homework;

public class WonderWoman extends SuperHero {
    int hasShield;
    int wearsCape;
    int indestructable;

    public WonderWoman(int hasShield,int wearsCape, int indestructable) {
        super (1);
        this.hasShield = hasShield;
        this.indestructable = indestructable;
        this.wearsCape = wearsCape;
    }
    @Override
    public String[] listSuperPowers() {
        return new String[]{"indestructable"};


    }



    public WonderWoman(int wearsTights) {
        super ( wearsTights );
    }
}
