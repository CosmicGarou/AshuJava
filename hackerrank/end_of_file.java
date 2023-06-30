package hackerrank;
import java.util.*;
public class end_of_file{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Strings:");
        int n=1;
        while(sc.hasNext()){
            System.out.println(n++ +" "+sc.nextLine());
        }
        sc.close();
    }
}