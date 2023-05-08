package ashuhomework;
    import java.util.*;

public class equal{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of A = ");
    int a = sc.nextInt();
    System.out.print("Enter the value of B = ");
    int b = sc.nextInt();
    
    if (a==b){
        System.out.println("A and B are equal");
    }
    else{
        System.out.println("A and B are not Equal");
    }
}
}