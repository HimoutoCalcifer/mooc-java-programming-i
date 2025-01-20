
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int valueisInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double valueisDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean valueisBoolean = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + valueisInt);
        System.out.println("You gave the double " + valueisDouble);
        System.out.println("You gave the boolean " + valueisBoolean);




    }
}
