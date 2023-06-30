package ashuhomework;
    import java.util.*;

public class greaterthan{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of A: ");
    double a = sc.nextDouble();
    System.out.print("Enter the value of B: ");
    double b = sc.nextDouble();
    System.out.print("Enter the value of C: ");
    double c = sc.nextDouble();
    if(a>b && a>c){
        System.out.println(a+" is the Greatest number");
    }
    else if(b>a && b>c){
        System.out.println(b+" is the Greatest number");
    }
    else{
        System.out.println(c+" is the Greatest number");
    }
    sc.close();
}
}