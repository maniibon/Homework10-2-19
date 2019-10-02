package Homework;

public class Instructor extends Person implements Teacher {


    Instructor(long Id, String name) {
        super ( Id, name );
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learner, double numberOfHours) {
        double numbetOfHoursPerLearner= numberOfHours/learner.length;
    }
}
