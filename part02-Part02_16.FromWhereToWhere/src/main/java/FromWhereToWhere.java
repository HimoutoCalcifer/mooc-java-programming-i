
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Where to? ");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int from = Integer.valueOf(scanner.nextLine());



        if (from <= end) {

            while (from <= end) {

                System.out.println(from);
                from++;

            }

        }






    }
}
