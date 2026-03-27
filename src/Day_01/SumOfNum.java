package Day_01;
import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter numbers (press x to stop): ");

        while (true) {
            String input = sc.next();

            if (input.equals("x") || input.equals("X")) {
                break;
            }

            int num = Integer.parseInt(input);
            sum = sum + num;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}