package pattern;
import java.util.*;
public class numpat3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
