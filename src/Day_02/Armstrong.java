// 9.To find Armstrong Number between two given number.
package Day_02;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        System.out.println("Enter a number");
        int temp = num;
        int sum = 0;


            while (num != 0) {
                int rem = num % 10;
                int cube = rem * rem * rem;
                sum = sum + cube;
                num = num / 10;
            }

        if (sum == temp) {
            System.out.println("Armstong");
        } else {
            System.out.println("Not Armstong");
        }


    }
}
