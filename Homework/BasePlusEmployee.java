package Homework;

public class BasePlusEmployee extends CommissionedEmployee{
    double baseSalary;

    public BasePlusEmployee(double baseSalary) {
        super (200.00,18.75);
        this.baseSalary = baseSalary;
    }

    public BasePlusEmployee(int grossSales, int commissionRate) {
        super ( grossSales, commissionRate );
    }

    public BasePlusEmployee(int firstName, int lastName, int employeeID) {
        super ( firstName, lastName, employeeID );
    }

    public BasePlusEmployee(double v, double v1) {
        super ();
    }

    @Override
    public double payCheck(double commissonRate, double  grossSales) {
        return  commissionRate * grossSales +  baseSalary;
}
}
