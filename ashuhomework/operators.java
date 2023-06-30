package ashuhomework;
import java.util.Scanner;
public class operators{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A");
        int a = sc.nextInt();
        System.out.println("Enter number B");
        int b = sc.nextInt();
        System.out.println("Enter the Operator");
        String s = sc.next();
        switch(s){
            case "+":
            System.out.println(a+b);
            break;
            case "-":
            System.out.println(a-b);
            break;
            case "/":
            System.out.println(a/b);
            break;
            case "%":
            System.out.println(a%b);
            break;
            case "*":
            System.out.println(a*b);
            break;
        }
        sc.close();
    }
}