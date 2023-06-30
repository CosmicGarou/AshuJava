package ashuhomework;
import java.util.Scanner;
public class sumofnumber {
    public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    System.out.print("Enter your number = ");
    int a = sc.nextInt();
    int i;
    int sum  = 0;
    for(i=1; i<=a; i++){
        sum+=i;
    } 
    System.out.println(sum);
    sc.close();
}
}