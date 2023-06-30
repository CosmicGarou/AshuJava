package pattern;
import java.util.*;
public class numpat {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1, p=1; i<=n; i++, p++){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2)-1; k++){
                if(k>=2 && k<=(i*2)-2){
                    System.out.print(" ");
                }
                else{
                    System.out.print(p+" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1, p=n-1; i>=1; i--, p--){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2)-1; k++){
                if(k>=2 && k<=(i*2)-2){
                    System.out.print(" ");
                }
                else{
                    System.out.print(p+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
