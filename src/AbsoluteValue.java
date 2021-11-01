import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In number" );
        int a = scanner.nextInt();
        if (a > 0 ) {
            System.out.println("| "  + a + "|" + a );
        }
         else {
            System.out.println("|" + a + "|" + "=" + -a );
        }


    }
}
