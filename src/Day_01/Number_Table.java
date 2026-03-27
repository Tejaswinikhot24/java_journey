// 3.Take a number as input and print the multiplication table for it.
package Day_01;
import java.util.Scanner;

public class Number_Table {
public static  void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Hey user \n Enter your number...");
    int num = sc.nextInt();
    System.out.println("This is a table of number " + num);
    for(int i=1; i<=10; i++) {
        int multiplication = i * num;
        System.out.println(num+" x "+i+" = "+multiplication);//num*i
    }

}
}
