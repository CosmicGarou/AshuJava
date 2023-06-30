package pattern;
import java.util.*;
public class numpat1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1, l=n; i<=n; i++, l--){
            int p=l;
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=n; k>=i; k--){
                System.out.print(p-- +"");
            }
            System.out.println();
        }
        sc.close();
    }
}
