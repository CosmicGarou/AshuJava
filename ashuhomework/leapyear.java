package ashuhomework;
    import java.util.*;

public class leapyear{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the year: ");
    int n = sc.nextInt();
    if(n%4==0){
        if(n%100==0 && n%400!=0){
            System.out.println("The year "+n+" is not a leap year");
        }
        else if(n%100==0 && n%400==0){
            System.out.println("The year "+n+" is a leap year");
        }
        else if(n%100!=0){
            System.out.println("The year "+n+" is a leap year");
        }
    }
    else {
        System.out.println("The year "+n+" is a not leap year");
    }
    sc.close();
}
}