// 1.Input a year and find whether it is a leap year or not.
package Day_01;
import java.util.*;

public class Leaf_Year{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year....");
        int year = sc.nextInt();
        if((year % 4 == 0  && year % 100 !=0 ) || (year % 400 == 0)){
            System.out.println(year+" is a Leaf year...");
        }
        else{  System.out.println(year+" is not a Leaf year...");
        }

    }
}