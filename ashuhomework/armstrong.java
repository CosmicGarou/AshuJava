package ashuhomework;
import java.util.Scanner;
public class armstrong {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int rem;
        int temp=n;
        int arm = 0;
        for(int i=0; n!=0; i++){
            rem=n%10;
            arm=arm+(rem*rem*rem);
            n=n/10;
        }
        if(arm==temp){
            System.out.println("It is armstrong number");
        }
        else{
            System.out.println("It is not armstrong number");
        }
        sc.close();
    }
}
