package array;
import java.util.Scanner;
public class linearsearch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the element you want: ");
        int x = sc.nextInt();
        for(int i=0; i<n; i++){
            if(x==a[i]){
                System.out.println("The position of your number is "+i);
                break;
            }
        }
        sc.close();
    }
}
