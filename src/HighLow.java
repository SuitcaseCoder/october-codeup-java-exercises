import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        highLow();
    }
    public static void highLow() {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 100);
        System.out.println("please guess the number (1 - 100): ");
        int guess = sc.nextInt();
        String playAgain = "";
    
        do {
            System.out.println(randomNum);
            if (guess < randomNum) {
                System.out.println("HIGHER");
                highLow();
            } else if (guess > randomNum) {
                System.out.println("LOWER");
                highLow();
            } else {
                System.out.println("GREAT GUESS!");
                System.out.println("do you want to play again? [y/n]");
                playAgain = sc.next();
            }
        }while(playAgain.equals("y"));
        
    }
}
