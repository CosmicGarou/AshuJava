package Projects;
    import java.util.Scanner;

public class guessthegame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mynum = (int) (Math.random() * 100);
        int usernum;
        do {
            System.out.print("Guess the number = ");
            usernum = sc.nextInt();
            if (usernum == mynum) {
                System.out.println("Hurray! Your guess is correct.");
                break;
            } else if (usernum < mynum) {
                System.out.println("Your guess is smaller than the number.");
            } else {
                System.out.println("Your guess is greater than the number.");
            }
        } while (usernum >= 0);
        System.out.print("The number was ");
        System.out.println(mynum);
        sc.close();
    }
}