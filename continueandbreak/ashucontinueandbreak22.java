package continueandbreak;
public class ashucontinueandbreak22{
    public static void main(String[]args){
        int i=0;
        while(true){
            if(i==4){
                i=i+1;
                continue;
            }
            System.out.println(i);
            i=i+1;
            if(i>8){
                break;
            }
        }
    }
}