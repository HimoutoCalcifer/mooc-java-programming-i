
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int positiveSum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == 0 ) {
                break;
            }

            if (input > 0) {
                positiveSum = positiveSum + input;
                number++;
            } else {
                continue;
            }



        }

        if (positiveSum == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            double avg = (double) positiveSum/number;
            System.out.println(avg);
        }


    }
}
