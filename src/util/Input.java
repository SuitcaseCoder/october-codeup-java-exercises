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
    }
    
    public String getString(){
        return this.scanner.nextLine();
    }
    
    public boolean yesNo() {
        System.out.println("yes or no?");
        String answer = scanner.nextLine();
        boolean playAgain;
        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
            return true;
        } else {
            
            return false;
        }
        
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
