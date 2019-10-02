package Homework;

public class SalariedEmployee extends Employee{

    protected int  weeklySalary;

    public SalariedEmployee(int weeklySalary){
        super("imani", "henry","W397585");
        this.weeklySalary = weeklySalary;
    }

    public SalariedEmployee(int firstName, int lastName, int employeeID) {
        super ();
    }

    @Override
    public void payCheck() {

        System.out.println (weeklySalary);
    }


    }

