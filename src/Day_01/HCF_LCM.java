// Take 2 numbers as inputs and find their HCF and LCM.
package Day_01;

import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello user \n Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int hcf = x;
        int lcm = (a * b) / hcf;

        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }
}