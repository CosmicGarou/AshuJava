package ashuhomework;
    import java.util.*;

public class area{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle:");
    int r=sc.nextInt();
    double a= 3.14 * r * r;
    double c= 3.14 * r * 2;
    System.out.print("Area is "+a);
    System.out.print("Circumference is "+c);
}
}