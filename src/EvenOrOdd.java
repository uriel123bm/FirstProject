import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("In first number");
        int firstNumber = scanner.nextInt();
        System.out.println("In second number");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
       if (sum %2 == 0   ){
            System.out.println("The solution is even " + sum );
        } else System.out.println("The solution is odd " + sum);
    }


}
