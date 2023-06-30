package ashuhomework;
import java.util.Scanner;
public class prime{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int temp = 0;
        int i = 2;
        while(i<n){
            if(n%i==0){
                temp = temp+1;
            }
            i++;
        }
        if(temp>0){
            System.out.println("The number is not Prime");
        }
        else {
            System.out.println("The number is Prime");
        }
        sc.close();
    }
}