package Section7.Challenge2;

import java.io.StringReader;

public class Customer {
     private String name;
     private long creditLimit;
     private String email;

    public String getCusName() {
        return name;
    }
    public long getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }

    public Customer(){
        System.out.println("Empty Fields");
    }
    public Customer(String name, long creditLimit, String email) {
        System.out.println("Fields created");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer(String name, String email){
        this(name, 87446L, email);
    }
}
