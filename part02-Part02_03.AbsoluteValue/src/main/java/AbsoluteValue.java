
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.valueOf(scanner.nextLine());


        int result;
        if (num < 0){
            result = num * -1 ;
            System.out.println(result);
        } else {
            System.out.println(num);
        }




    }
}
