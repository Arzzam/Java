package Section7.Challenge3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SalariedEmployee extends Employee {
    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double ms = annualSalary / 12;
        double pms = (isRetired) ? (0.9 * ms) : ms;
        return pms;
    }

    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }
}
