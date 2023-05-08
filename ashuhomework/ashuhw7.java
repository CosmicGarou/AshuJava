package ashuhomework;
import java.util.Scanner;
public class ashuhw7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        int rem = 0;
        int rev = 0;
        int temp = n;
        while(temp>0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if (rev == n){
            System.out.println("Your number " +n+ " is a pallindrome");
        }
        else{
            System.out.println("Your number "+n+" not pallindrome");
        }
    }
}
