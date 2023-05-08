package ashuhomework;
    import java.util.*;

public class temptofar{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the temp in celcius = ");
    double c= sc.nextInt();
    double f= (c * 1.8)+32;
    System.out.print("Fehrenheit ==> "+String.format("%.3f",f));
}
}