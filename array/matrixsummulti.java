package array;
import java.util.Scanner;
public class matrixsummulti{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix: ");
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];
        int d[][] = new int[n][n];
        System.out.println("Enter elements of Matrix A:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix A:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix B:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    d[i][j]=d[i][j]+a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Matrix Sum:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix Multiplication:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}