// 4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package Day_02;
import java.util.Scanner;

public class Calculate{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1 = input.nextInt();
        System.out.print("Enter second number:");
        int num2 = input.nextInt();

        System.out.print("Enter Operator (+,-,*,/): ");
        char operator = input.next().charAt(0);
        if(operator == '+'){
            System.out.println("Result = "+(num1+num2));
        }else if(operator == '-'){
            System.out.println("Result = "+(num1-num2));
        } else if (operator == '*') {
            System.out.println("Result = "+(num1*num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Result = " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by 0");
            }
        }
        else{
                System.out.println("Invalid operator");
            }



    }
}