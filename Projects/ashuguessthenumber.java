package Projects;
import java.util.Scanner;
public class ashuguessthenumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int mynum = (int)(Math.random()*100);
        int usernum=0;
        do{
            System.out.print("Guess the number = ");
            if(usernum==mynum){
                System.out.println("Hurry! Your number is correct");
            break;
            }
            else if(usernum<mynum){
                System.out.println("Your number is smaller than the number");
            
            }
            else {
                System.out.println("Your number is greater than the number");
            
            }

        } while(usernum>=0);
        System.out.print("The number was ");
        System.out.println(mynum);
        sc.close();
        }
    }
    