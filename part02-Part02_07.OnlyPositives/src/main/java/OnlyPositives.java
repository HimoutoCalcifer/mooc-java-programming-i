
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        while (true) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());

            int result;

            if (num < 0) {
                System.out.println("Unsuitable number");
                continue;
            }

            if (num == 0) {
                break;
            }

            if (num > 0) {
                result = num * num;
                System.out.println(result);
            }






        }

    }
}
