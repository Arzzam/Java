package Section7.Challenge3;

public class Main {
    public static void main(String[] args) {
        Employee nafil = new Employee("Nafil", "19/07/2002", "30/01/2023");
        System.out.println(nafil);
        System.out.println("Age: " + nafil.getAge());
        System.out.println("Pay: " + nafil.collectPay());

        SalariedEmployee leethiyal = new SalariedEmployee("Leethiyal", "10/05/2000", "01/01/2023", 600000);
        System.out.println(leethiyal);
        System.out.println("Age: " + leethiyal.getAge());
        System.out.println("Pay: " + leethiyal.collectPay());
        leethiyal.retire();
        System.out.println("Pension check: " + leethiyal.collectPay());

        HourlyEmployee motherFather = new HourlyEmployee("MotherFather", "10/10/1910", "01/01/2023", 300);
        System.out.println(motherFather);
        System.out.println("Age: " + motherFather.getAge());
        System.out.println("Pay: " + motherFather.collectPay());
        System.out.println("Pay: " + motherFather.getDoublePay());

    }
}
