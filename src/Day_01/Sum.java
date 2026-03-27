// 2.Take two numbers and print the sum of both.
package Day_01;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number: ");
        int num2 = sc.nextInt();

        int result = num1 + num2;
        System.out.println("The sum of two numbers is: " +result);
    }
}
