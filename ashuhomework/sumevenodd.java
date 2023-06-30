package ashuhomework;
import java.util.Scanner;
public class sumevenodd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        int sumeven = 0;
        int sumodd = 0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                sumeven+=i;
            }
            else{
                sumodd+=i;
            }
        }
        System.out.println("The sum of even numbers from 1 to "+n+" is "+sumeven);
        System.out.println("The sum of odd numbers from 1 to "+n+" is "+sumodd);
        sc.close();
    }
}
