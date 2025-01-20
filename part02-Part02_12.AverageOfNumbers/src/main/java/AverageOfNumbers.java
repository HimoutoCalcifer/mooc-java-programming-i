
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0 ) {
                break;
            } else {
                sum = sum + input;
                number++;
            }
        }


        // System.out.println(sum);
        // System.out.println(number);
        double avg = (double) sum/number;
        System.out.println("Average of the numbers: " + avg);



    }
}
