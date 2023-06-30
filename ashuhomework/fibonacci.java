package ashuhomework;
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of term: ");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        int i = 1;
        while(i<=n){
            System.out.print(a);
            c = a+b;
            a=b;
            b=c;
            i++;
        }
        sc.close();
    }
}