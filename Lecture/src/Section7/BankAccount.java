package Section7;

public class BankAccount {
    private long accNo;
    private int accBal;
    private String cusName;
    private String cusEmail;
    private long cusPhone;

    //    Default Constructor
    public BankAccount() {
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

    //    Getter for Bank Account
    public long getAccNo() {
        return accNo;
    }

    public int getAccBal() {
        return accBal;
    }

    public String getCusName() {
        return cusName;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public long getCusPhone() {
        return cusPhone;
    }

    //    Setter for Bank Account
    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public void setAccBal(int accBal) {
        this.accBal = accBal;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
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
