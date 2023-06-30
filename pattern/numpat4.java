package pattern;
import java.util.*;
public class numpat4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print(" ");
            }
            int p=1;
            for(int k=1; k<=i; k++){
                System.out.print(p++ +"");
            }
            int q=i-1;
            for(int l=2; l<=i; l++){
                System.out.print(q-- +"");
            }
            System.out.println();
        }
        sc.close();
    }
}
