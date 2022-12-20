package Section7;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        acc.setCusName("Nafil Arzzam");
        acc.setAccNo(23700156789L);
        acc.setAccBal(1000);
        acc.setCusEmail("arzzam19@gmail.com");
        acc.setCusPhone(8778893933L);

        acc.deposit(1000);
        acc.withdraw(1500);
        acc.withdraw(501);
    }
}
