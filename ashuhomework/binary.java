package ashuhomework;
import java.util.Scanner;
public class binary {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int n = sc.nextInt();
        int rem;
        int i=0;
        int[] a = new int[10];
        System.out.print("The binary number is ");
        while(n>0){
            rem = n%2;
            n=n/2;
            a[i]=rem;
            i++;
        }
        for(int j=i-1; j>=0; j--){
            System.out.print(a[j]);
        }
        sc.close();
    }
}
