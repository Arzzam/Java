package Section7.Challenge3;

import java.time.Year;

public class Worker {
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){

    }
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = Year.now().getValue();
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return currentYear - birthYear;
    }

    public
}