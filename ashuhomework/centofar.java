package ashuhomework;
import java.util.Scanner;
public class centofar {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature in Centigrade: ");
        double c = sc.nextDouble();
        double f = ((c*9)/5)+32;
        System.out.println("The temperature in Farenheit is "+f);
        sc.close();
    }
}
