package pattern;
import java.util.*;
public class numberpattern {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1, p=2; i<=n;  i++, p=p+2){
            for(int j=1; j<=i; j++){
                if(i%2==0){
                    System.out.print(2+" ");
                }
                else{
                    System.out.print(1+" ");
                }
                }
            System.out.println();
            }
            sc.close();
        }
    }   
