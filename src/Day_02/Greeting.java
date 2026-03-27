// 2.Take name as input and print a greeting message for that particular name.
package Day_02;
import java.util.Scanner;

public class Greeting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey User!! \n Enter Your Name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);

    }
}