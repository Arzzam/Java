package Section7.Challenge2;

public class Main {

    public static void main(String[] args) {
        Customer cus = new Customer();
        Customer cus1 = new Customer("Nafil", 76318452L, "arzzam19@gmail.com");
        Customer cus2 = new Customer("Arzzam", "nafilarzzam19@gmail.com");

        System.out.println(cus2.getCusName());
        System.out.println(cus2.getCreditLimit());
        System.out.println(cus2.getEmail());
        System.out.println(cus1.getCusName());
        System.out.println(cus1.getCreditLimit());
        System.out.println(cus1.getEmail());
    }

}
