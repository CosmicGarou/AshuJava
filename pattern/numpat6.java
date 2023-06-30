package pattern;
import java.util.*;
public class numpat6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int p=i;
            for(int j=1; j<=i; j++){
                System.out.print(p++ +"");
                p=p+4-j;
            }
            System.out.println();
        }
        sc.close();
}
}
