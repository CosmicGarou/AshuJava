package ashuhomework;
    import java.util.*;
public class grademarking{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter marks of subject 1: ");
    int a = sc.nextInt();
    System.out.print("Enter marks of subject 2: ");
    int b = sc.nextInt();
    System.out.print("Enter marks of subject 3: ");
    int c = sc.nextInt();
    System.out.print("Enter marks of subject 4: ");
    int d = sc.nextInt();
    System.out.print("Enter marks of subject 5: ");
    int e = sc.nextInt();
    int sum = a+b+c+d+e;
    float per = sum/5;
    System.out.println("Your Total marks obtained is "+sum);
    if(per>=90){
        System.out.println("Your percentage is "+per+" and you got A grade");
    }
    else if(per>=80){
        System.out.println("Your percentage is "+per+" and you got B grade");
    }
    else if(per>=60){
        System.out.println("Your percentage is "+per+" and you got C grade");
    }
    else{
        System.out.println("Your percentage is "+per+" and you got D grade");
    }
    sc.close();
}
}