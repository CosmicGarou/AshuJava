package array;
import java.util.Scanner;
public class diagonalsum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of row:");
        int m = sc.nextInt();
        System.out.println("Enter size of column:");
        int n = sc.nextInt();
        int sumL=0;
        int sumR=0;
        int a[][] = new int[m][n];
        System.out.println("Enter elements of Matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    sumL=sumL+a[i][j];
                }
                if(i+j==n-1){
                    sumR=sumR+a[i][j];
                }
            }
        }
        System.out.println("Matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Sum of left diagonal of Matrix: "+sumL);
        System.out.println("Sum of right diagonal of Matrix: "+sumR);
        sc.close();
    }
}
