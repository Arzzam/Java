package Section7.Challenge3;

public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(){
        return 2 * collectPay();
    }

    @Override
    public double collectPay(){
        return hourlyPayRate * 240;
    }
}
