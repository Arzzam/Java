package Section6;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int count = 1, sum = 0;

//        while (count <= 5){
//            System.out.println("Enter Valid number #" + count + " : ");
//            String userInput = ip.nextLine();
//            try {
//                double userIp = Double.parseDouble(userInput);
//                count++;
//                sum += userIp;
//            } catch (NumberFormatException e){
//                System.out.println("Invalid Input!! Enter a Valid number");
//            }
//        }

        do {
            System.out.println("Enter Number to sum #" + count + " : ");
            String userInput = ip.nextLine();
            try {
                double userIp = Double.parseDouble(userInput);
                count++;
                sum += userIp;
            } catch (NumberFormatException e) {
                System.out.println("Character not valid!! Enter a valid input");
            }
        } while (count <= 5);
        System.out.println(sum);
    }
}
