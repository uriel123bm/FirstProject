import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a=");
        int a = scanner.nextInt();
        System.out.print("b=");
        int b = scanner.nextInt();
        System.out.print("c=");
        int c = scanner.nextInt();
        double Result1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double Result2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        if (Result1 == Result2) {
            System.out.println("There is only one solution: ");
            System.out.println( "X= " + Result1);
        } else if (Result1 > Result2 || Result1 < Result2) {
            System.out.println("There are 2 solution: ");
            System.out.println("X1 = " +Result1);
            System.out.println("X2 = " +Result2);
        } else {
            System.out.println("There is no solution");
        }

    }
}

