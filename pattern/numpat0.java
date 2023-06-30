package pattern;
import java.util.*;
public class numpat0 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int p=1;
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2)-1; k++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            int p=1;
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2)-1; k++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
