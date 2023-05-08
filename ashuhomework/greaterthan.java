package ashuhomework;
    import java.util.*;

public class greaterthan{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a = ");
    int a=sc.nextInt();
    System.out.println("Enter the value of b = ");
    int b=sc.nextInt();
    System.out.println("Enter the value of c = ");
    int c=sc.nextInt();
    if (a>=b && a>=c){
        System.out.println(a+" is the Greatest");
    }
    else if (b>=a && b>=c){
        System.out.println(b+" is the Greatest");
    }
    else if (c>=a && c>=b){
        System.out.println(c+" is the Greatest");
    }

}
}