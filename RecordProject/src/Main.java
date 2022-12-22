public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            Students s = new Students("95281910400" + i,
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
    }
}