// 1.Write a program to print whether a number is even or odd, also take input from the user.
package Day_02;
import java.util.Scanner;

public class Even_Odd{
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int num = sc.nextInt();
        // ternary operator
        System.out.println(num + " is " + (num % 2 == 0 ? "Even Number." : "Odd Number."));


//        if(num % 2 == 0){
//            System.out.println(num+" is Even Number.");
//        }else {
//            System.out.println(num + " is Odd Number. ");
//        }
        sc.close();
    }
}