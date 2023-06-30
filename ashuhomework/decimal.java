package ashuhomework;
import java.util.Scanner;
public class decimal {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary number: ");
        int n =sc.nextInt();
        int d=0, rem=0;
        int i=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            d=d+(rem*(int)Math.pow(2,i++));
            
        }
        System.out.println("The Decimal number is "+d);
        sc.close();
    }
}
