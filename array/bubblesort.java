package array;
import java.util.Scanner;
public class bubblesort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        int t;
        int flag=0;
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int i=0; i<n; i++){
            System.out.println(a[i]+" ");
        }
        sc.close();
    }
}
