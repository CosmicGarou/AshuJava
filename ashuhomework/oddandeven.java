package ashuhomework;
    import java.util.*;

public class oddandeven{
public static void main(String[] args){
    System.out.print("Enter your number = ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a%2==0){
        System.out.println(a+" is even");
    }
    else{
        System.out.println(a+ " is odd");
    }
}
}