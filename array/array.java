package array;
import java.util.Scanner;
public class array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0;
        System.out.println("Enter your marks of 3 Subjects:");
        int i = 0;
        while(i<3){
            arr[i] = sc.nextInt();
            sum=sum+arr[i];
            i++;
        }
        int per = sum/3;
        if(per>33){
            System.out.println("You are passed!!!");
        }
        else{
            System.out.println("You are failed");
        }
        sc.close();
    }
}
