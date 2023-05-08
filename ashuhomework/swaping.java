package ashuhomework;
    import java.util.*;

public class swaping{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the value of x = ");
    int x = sc.nextInt();
    System.out.print("Enter the value of y = ");
    int y = sc.nextInt();
    int temp = 0;

    temp = x;
    x = y;
    y = temp;
    System.out.print("a = "+x);
    System.out.print("b = "+y);
}
}