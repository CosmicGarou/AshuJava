package pattern;
import java.util.*;
public class numpat2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int p=1;
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(p++ +" ");
            }
            for(int l=1; l<=n; l++){
                System.out.print(p-- +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
