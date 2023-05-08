package ashuhomework;
import java.util.Scanner;
public class ashuhw6{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int rem = 0;
    int rev = 0;
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int temp = n;
    while(temp>0){
        rem = temp%10;
        rev = rev*10+rem;
        temp = temp/10;
    }
    System.out.println(rev);
    }
}