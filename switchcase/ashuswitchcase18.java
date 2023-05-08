package switchcase;
import java.util.Scanner;
public class ashuswitchcase18 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your rating = ");
        int rate = sc.nextInt();

        switch(rate){
            case 1 :
            System.out.println("You have given 1 Star");
            break;
            case 2 :
            System.out.println("You have given 2 Star");
            break;
            case 3 :
            System.out.println("You have given 3 Star");
            break;
            default :
            System.out.println("Invalid Rating");
        }
    }
}
