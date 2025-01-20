
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How old are you? ");
        int old = Integer.valueOf(scan.nextLine());


        //(at least 0 and at most 120)
        //0-120
        if (old > -1 && old < 121){
            System.out.println("OK");
        } else {
            System.out.println("Impossible");
        }
    }
}
