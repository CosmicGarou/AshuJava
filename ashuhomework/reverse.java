package ashuhomework;
import java.util.Scanner;
public class reverse {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rev=0,rem;
        int i =0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
            i++;
        }
        System.out.println("The reverse of the number is "+rev);
        sc.close();
    }
}
