package Homework;

public class CommissionedEmployee extends Employee {
    double grossSales;
    double commissionRate;

    public CommissionedEmployee(double  grossSales, double commissionRate){
        super("imani","Henry","");
        this.commissionRate = commissionRate;
       this.grossSales = grossSales;

    }

    public CommissionedEmployee(int firstName, int lastName, int employeeID) {
        super ( );
    }

    public CommissionedEmployee(double v) {
        super ();
    }

    public CommissionedEmployee() {
        super ("imani","Henry","W395379");
    }


    @Override
    public double payCheck (double commissionRate,double grossSales){
        return grossSales*commissionRate;

    }

    public CommissionedEmployee(char firstName, char lastName, char employeeID) {
        super ( firstName, lastName, employeeID );
    }

    public CommissionedEmployee(String imani, String henry, String w397585) {
        super ( imani, henry, w397585 );
    }

    @Override
    public void payCheck() {
        super.payCheck ();
    }
}