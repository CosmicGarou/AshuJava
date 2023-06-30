package pattern;
import java.util.*;
public class numpat5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            for(int i=1; i<=n; i++){
            int p=1;
            for(int j=n; j>=i; j--){
                System.out.print(p++ +"");
            }
            for(int k=1; k<=(i*2)-2; k++){
                System.out.print("*");
            }
            int q=n-i+1;
            for(int l=n; l>=i; l--){
                System.out.print(q-- +"");
            }
            System.out.println();
        }
        sc.close();
    }
}
