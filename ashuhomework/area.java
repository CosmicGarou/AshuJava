package ashuhomework;
    import java.util.Scanner;
import java.lang.Math;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14159;
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of the circle is "+pi*Math.pow(r,2));
        System.out.println("Circumference of the circle is "+2*pi*r);
        sc.close();
    }
}