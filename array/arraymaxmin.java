package array;
import java.util.Scanner;
public class arraymaxmin {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
        a[i] = sc.nextInt();
        }
        int max=a[0];
        for(int i=1; i<n; i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("The maximum number in array is "+max);
        int min=a[0];
        for(int i=1; i<n; i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("The minimum number is "+min);
        sc.close();
}
}
