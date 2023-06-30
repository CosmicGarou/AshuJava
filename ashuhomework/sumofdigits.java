package ashuhomework;
import java.util.Scanner;
public class sumofdigits{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rem;
        int sum=0;
        for(int i =0; n!=0; i++){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("The number is "+sum);
        sc.close();
    }
}