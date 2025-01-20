
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());

        //5 000 — 25 000	100	8
        //25 000 — 55 000	1 700	10
        //55 000 — 200 000	4 700	12
        //200 000 — 1 000 000	22 100	15
        //1 000 000 —	142 100	17

        //6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08)
        //75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12)

        //no tax: gift < 5000

        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift < 25001) {
            System.out.println("Tax: " + (100 + (gift - 5000) * 0.08));
        } else if (gift < 55001) {
            System.out.println("Tax: " + (1700 + (gift - 25000) * 0.10));
        } else if (gift < 200001) {
            System.out.println("Tax: " + (4700 + (gift - 55000) * 0.12));
        } else if (gift < 1000001) {
            System.out.println("Tax: " + (22100 + (gift - 200000) * 0.15));
        } else {
            System.out.println("Tax: " + (142100 + (gift - 1000000) * 0.17));
        }
    }
}
