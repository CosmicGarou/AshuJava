package ashuhomework;
import java.util.Scanner;
public class ashuhw8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rem = 0;
        int arm = 0;
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n;
        while(temp>0){
            rem = temp%10;
            arm = arm+(rem*rem*rem);
            temp = temp/10;
        }
        if(n==arm){
            System.out.println("Your number "+n+" is an Armstrong");
        }
        else{
            System.out.println("Your number "+n+ " is not an Armstrong");
        }
        System.out.println();
        sc.close();
        }
    }