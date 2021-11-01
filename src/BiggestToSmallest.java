import java.util.Scanner;

public class BiggestToSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Chose first number ");
        int a = scanner.nextInt();
        System.out.print(" Chose second number ");
        int b = scanner.nextInt();
        System.out.print(" Chose third number ");
        int c = scanner.nextInt();
        if (a >= b && a >= c) {
            System.out.print(a+ " , " + " ");
            if (b >= c) {
                System.out.print(b + " " + " , " + c);
            } else System.out.print(c + " " + " , " + b);
        } if (b >= a && b >= c) {
            System.out.print(b+ " , " + " ");
            if (a >= c) {
                System.out.print(a + " " + " , " + c);
            } else System.out.print(c + " " + " , " + a);
        }
        if (c >= a && c >= b) {
            System.out.print(c+ " , " + " ");
            if (a >= b) {
                System.out.print(a + " " + " , " + b);

            }else System.out.print(b + " " + " , " + a);
        }
    }
}