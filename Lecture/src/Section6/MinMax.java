package Section6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int count = 1;
        double min = 0, max = 0;

        while (true) {
            System.out.println("Enter to find min and max value # " + count + " : ");
            String userIp = ip.nextLine();
            try {
                double userInput = Double.parseDouble(userIp);
                min = userInput;
                if (userInput > max)
                    max = userInput;
                else if (userInput < min)
                    min = userInput;
                count++;
            } catch (NumberFormatException e) {
                break;
            }
        }
        if (count > 1) {
            System.out.println("Min " + min);
            System.out.println("Max " + max);
        }else {
            System.out.println("No valid data entered");
        }
    }
}
