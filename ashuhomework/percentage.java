package ashuhomework;
import java.util.*;
public class percentage{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks:");
    int m1=sc.nextInt();
    int m2=sc.nextInt();
    int m3=sc.nextInt();
    int m4=sc.nextInt();
    int m5=sc.nextInt();

    int sum=m1+m2+m3+m4+m5;
    System.out.println("Total marks obtained = "+sum);
    float p=sum/5;
    System.out.println("Percentage = "+p+" %"); 
    sc.close();
}
}