package Homework;

;

public class JojoImani extends SuperHero {
    int invisablity;
    int SuperStrenght;
    int smart;
    int canReadMinds;


    public JojoImani(int invisablity,int SuperStrength,int smart, int canReadMinds) {
     super(2);
    this.canReadMinds = canReadMinds;
    this.SuperStrenght = SuperStrength;
    this.smart = smart;
    this.invisablity = invisablity;

}

    @Override
    public String[] listSuperPowers() {
        return new String[]{"SuperStrength"};


    }

    public JojoImani(int wearsTights) {
        super ( wearsTights );
    }
}
