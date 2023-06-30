package ashuhomework;
import java.util.Scanner;
public class swappingwithout {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of A: ");
        int a = sc.nextInt();
        System.out.print("Enter value of B: ");
        int b = sc.nextInt();
        int t;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value of A: "+a);
        System.out.println("Value of B: "+b);
        sc.close();
    }
}
