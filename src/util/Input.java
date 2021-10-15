package util;
import java.util.Scanner;


    // 1. Create an input validation class
public class Input {
    private final Scanner scanner;
    private int number;
    private double dub;
    private String answer;
    private boolean yesNo;
    
    public Input(){
        this.scanner = new Scanner(System.in);
        this.number = number;
        this.dub = dub;
        this.answer = answer;
        this.yesNo = yesNo;
    }
    
    public String getString(){
        System.out.println("yes or no?");
        this.answer = this.scanner.nextLine();
        return this.answer;
    }
    
    public boolean yesNo() {
//        getString();
        boolean playAgain = false;
        while(playAgain) {
            System.out.println("would you like to continue?[true/false]");
            playAgain = scanner.nextBoolean();
            if (this.answer.equalsIgnoreCase("y") || this.answer.equalsIgnoreCase("yes")) {
                this.yesNo = true;
                playAgain = false;
                System.out.println("thanks for playing!");
            } else {
                playAgain = true;
                this.yesNo = false;
            }
        };
//        System.out.println(this.yesNo);
        return playAgain;
    }
    
    public int getInt(int min, int max) {
        this.number = getInt();
        // keep prompting user for input until int is within min and max
//        System.out.println("pick a number: ");
//        int numGuess = scanner.nextInt();
        getInt();
        if(this.number <= min  || this.number >= max){
            System.out.println("wrong! try again");
            getInt();
        } else {
            System.out.println("you got it!");
        }
        return this.number;
    }
    
    
    
    public int getInt(){
        System.out.println("pick a number");
        this.number = this.scanner.nextInt();
        return this.number;
    }
    
    public double getDouble(double min, double max){
        this.dub =  getDouble();
        if(dub <= min || dub >= max){
            System.out.println("sorry please try again");
            getDouble();
        } else {
            System.out.println("you got it!");
            this.dub = dub;
        }
        return this.dub;
    }
    
    public double getDouble(){
        System.out.println("please enter a num");
        return scanner.nextDouble();
    }
    
}
