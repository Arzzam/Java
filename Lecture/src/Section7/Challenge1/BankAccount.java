package Section7.Challenge1;

public class BankAccount {
    private long accNo;
    private int accBal;
    private String cusName;
    private String cusEmail;
    private long cusPhone;

    //    Default Constructor
    public BankAccount() {
        //  Using Constructor Chaining
        this("DefaultName", 123456789L, 0, 987654321L, "defaultname@gmail.com");
        System.out.println("Empty constructor initialized");
    }

    //    Set data using Constructor
    public BankAccount(String cusName, long accNo, int accBal, long phoneNo, String email) {
        System.out.println("Account Created");
        this.cusName = cusName;
        this.accNo = accNo;
        this.accBal = accBal;
        cusEmail = email;
        cusPhone = phoneNo;
    }

//    Using 3 field in Constructor
    public BankAccount(String cusName, String cusEmail, long cusPhone) {
        this(cusName, 99999L, 10000, cusPhone, cusEmail);
//        this.cusName = cusName;
//        this.cusEmail = cusEmail;
//        this.cusPhone = cusPhone;
    }

    //    Getter for Bank Account
    public long getAccNo() {
        return accNo;
    }

    //    Setter for Bank Account
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public int getAccBal() {
        return accBal;
    }

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public long getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(long cusPhone) {
        this.cusPhone = cusPhone;
    }


    //    DEPOSIT FUNCTION / METHOD:
    public void deposit(int depositAmount) {
        accBal += depositAmount;
        System.out.println("Your current balance is: " + accBal);
    }

    //    WITHDRAW METHOD
    public void withdraw(int withdrawAmount) {
        if (accBal - withdrawAmount < 0) {
            System.out.println("Sorry, Could be processed due to Insufficient Balance");
        } else {
            accBal -= withdrawAmount;
            System.out.println("Successfully Withdrawn");
            System.out.println("Your balance is: " + accBal);
        }
    }

}
