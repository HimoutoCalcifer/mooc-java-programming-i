
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.valueOf(scanner.nextLine());

        for (int start = input; start <= 100; start++) {
            System.out.println(start);

        }

    }
}
