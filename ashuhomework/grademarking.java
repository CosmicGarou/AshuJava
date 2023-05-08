package ashuhomework;
    import java.util.*;
public class grademarking{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks = ");
    int m1 = sc.nextInt();
    int m2 = sc.nextInt();
    int m3 = sc.nextInt();
    int m4 = sc.nextInt();
    int m5 = sc.nextInt();

    int sum = m1+m2+m3+m4+m5;
    int p = sum/5;
    System.out.println("Percentage = "+p+" %");
    if (p >=90){
        System.out.println("Grade ==> A");   
    }
    else if (p >=80){
        System.out.println("Grade ==> B");   
    }
    else if (p >=60){
        System.out.println("Grade ==> C");   
    }
    else if (p <60){
        System.out.println("Grade ==> D");   
    }
}
}