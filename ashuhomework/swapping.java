package ashuhomework;
import java.util.Scanner;
public class swapping {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        float a = sc.nextFloat();
        System.out.print("Enter the value of B: ");
        float b = sc.nextFloat();
        float c;
        c=a;
        a=b;
        b=c;
        System.out.println("The value of A is "+a);
        System.out.println("The value of B is "+b);
        sc.close();
    }
}
