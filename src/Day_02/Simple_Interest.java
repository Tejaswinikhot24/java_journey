// 3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package Day_02;
import java.util.Scanner;

public class Simple_Interest{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Time: ");
        double t = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double r = sc.nextDouble();

        double SI = (p * t * r)/100;
        System.out.println("Simple Interest= "+SI);

        sc.close();
    }
}