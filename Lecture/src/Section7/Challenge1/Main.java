package Section7.Challenge1;

import Section7.Challenge1.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
//        BankAccount acc = new BankAccount("Leethiyal", 234567891L,
//                1000, 9791588743L, "leethiyaldevaraj10@gmail.com");
        System.out.println(acc.getCusEmail());
        acc.setCusName("Nafil Arzzam");
        acc.setAccNo(23700156789L);
        acc.setAccBal(1000);
        acc.setCusEmail("arzzam19@gmail.com");
        acc.setCusPhone(8778893933L);

        acc.deposit(1000);
        acc.withdraw(1500);
        acc.withdraw(501);

        BankAccount arzzamAcc = new BankAccount("Arzzam", "arzzam29@gmail.com", 943874374L);
        System.out.println("Account no: " + arzzamAcc.getAccNo() + " Name: " + arzzamAcc.getCusName());
    }
}
