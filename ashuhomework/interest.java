package ashuhomework;
import java.util.Scanner;
import java.lang.Math;
public class interest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principle amount: ");
        double p = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter time period in years: ");
        double t = sc.nextDouble();
        double si = (p*r*t)/100;
        System.out.print("Enter number of times the interest was compounded: ");
        double n = sc.nextDouble();
        double amount = p*Math.pow(1 + r/100,t);
        double ci = amount-p;
        System.out.println("The Simple Interest is "+si);
      
        System.out.println("The Compound Interest is "+ci);
        sc.close();
    }
}