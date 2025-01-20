
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Last number? ");
        int input = Integer.valueOf(scanner.nextLine());

        int sum = 0;

        for (int start = 0; start <= input; start++) {
            sum = sum + start;
        }

        System.out.println("The sum is " + sum);

    }
}
