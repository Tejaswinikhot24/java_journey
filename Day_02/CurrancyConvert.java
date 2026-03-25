// 6.Input currency in rupees and output in USD.
import java.util.Scanner;

public class CurrancyConvert {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter amount in Rupees:  ");
        double rupees = sc.nextDouble();

        double usd = rupees * 0.012;

        System.out.println("Amount in USD: $" + usd);

        sc.close();
    }
}
