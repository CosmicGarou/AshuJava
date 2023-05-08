package ifelse;
import java.util.Scanner;
public class ashuifelse17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of cash = ");
        float cash = sc.nextFloat();
        if(cash<=10){
            System.out.println("You cannot buy anything!");
            System.out.println("You have very low amount of cash!");

        }
        else if(cash>10 && cash<=50){
            System.out.println("You can buy few things!");

        }
        else {
            System.out.println("You can buy alot of things!");
            System.out.println("You are now a Top G!");
        }
    }
}
