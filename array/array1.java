package array;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int s = sc.nextInt();
        System.out.println("Enter the elements of the first array:");
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the second array:");
        int[] arr2 = new int[s];
        for (int i = 0; i < s; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] sum = new int[s];
        for (int i = 0; i < s; i++) {
            sum[i] = arr[i] + arr2[i];
        }
        System.out.println("Sum of the arrays:");
        for (int i = 0; i < s; i++) {
            System.out.print(sum[i] + " ");
        }
        sc.close();
    }
}