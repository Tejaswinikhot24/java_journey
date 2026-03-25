// 5.Take 2 numbers as input and print the largest number.
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
           System.out.println((a>b )? a+" is largest number" :(b>a) ? b+" is largest number" : " Both are equal");
        if (a > b) {
            System.out.println(a + " is largest number");
        } else if(b>a){
            System.out.print((b + " is largest number"));
        }else{
            System.out.println(a +" and " + b +" Both are equal");
        }

    }

}
