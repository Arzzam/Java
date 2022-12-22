public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudents s = new LPAStudents("95281910400" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Lee";
                        case 3 -> "Nafil";
                        case 4 -> "Riyas";
                        case 5 -> "Aldo";
                        default -> "Anonymous";
                    },
                    switch (i) {
                        case 1 -> "01/01/2000";
                        case 2 -> "01/02/2000";
                        case 3 -> "01/03/2000";
                        case 4 -> "01/04/2000";
                        case 5 -> "01/05/2000";
                        default -> "19/07/2002";
                    },
                    "Java Masterclass");
            System.out.println(s);
        }

        Students pojoStudents = new Students("952819104032", "Nafil Arzzam", "19/07/2002", "Java Masterclass");
        LPAStudents recordStudents = new LPAStudents("952819104302", "Leethiyal D", "10/05/2000", "Java Masterclass");
        System.out.println(pojoStudents);
        System.out.println(recordStudents);
//        Changes in data setter
        pojoStudents.setClassList(pojoStudents.getClassList() + "Java OCP Exam 829");
//        Record doesn't have a setter
//        recordStudents.setClassList(recordStudents.classList() + "Java OCP Exam 829");

//      Changes in the data Getter
        System.out.println(pojoStudents.getName() + " is taking " + pojoStudents.getClassList());
//       the below line is error because the record doesn't provide getters
//        System.out.println(LPAStudents.getName() + " is taking " + LPAStudents.getClassList());
        System.out.println(recordStudents.name() + " is taking " + recordStudents.classList());
    }
}