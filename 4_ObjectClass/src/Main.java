public class Main {
    public static void main(String[] args) {

        Student nafil = new Student("Nafil", 20);
        System.out.println(nafil.toString());

        PrimarySchoolStudent hani = new PrimarySchoolStudent("Haniya", 1, "Thansila");
        System.out.println(hani);
    }
}

class Student {
    private final String name;
    private final int age;

    Student (String name, int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
        return name + " is " + age;
    }

}

class PrimarySchoolStudent extends Student {
    private String parentName;

    PrimarySchoolStudent (String name, int age, String parentName){
        super(name,  age);
        this.parentName =  parentName;
    }

    public String toString (){
        return parentName + "'s kid, " + super.toString();
    }
}