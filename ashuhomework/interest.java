package ashuhomework;
    import java.util.*;
import java.lang.Math;

public class interest{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter time:");
    double t=sc.nextDouble();
    
    System.out.println("Enter rate:");
    double r=sc.nextDouble();
    
    System.out.println("Enter principle:");
    double p=sc.nextDouble();

    double s=(p*t*r)/100;
    double r1= r/100.0;
    double r2=Math.pow(1.0+r1,t);
    double c=(p*r2)-p;

    System.out.println("Simple Interest is "+s);
    System.out.println("Compound Interest is "+String.format("%.4f",c));
}
}