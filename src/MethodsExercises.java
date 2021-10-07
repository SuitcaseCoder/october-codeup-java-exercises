import java.util.Scanner;

public class MethodsExercises {
//    public static void main(String[] args) {
//        System.out.println(addition(5,10));
//        System.out.println(subtraction(10,5));
//        System.out.println(multiplication(2,4));
//        System.out.println(division(4,2));
//    }
//
//    // 1. Basic Arithmetic
//    // a.
//    public static int addition(int param1, int param2){
//        return param1 + param2;
//    }
//
//    public static int subtraction(int param1, int param2){
//        return param1 - param2;
//    }
//
//    public static int multiplication(int param1, int param2){
//        return param1 * param2;
//    }
//
//    public static int division(int param1, int param2){
//        return param1 / param2;
//    }
    
    // 2.
public static void main(String[]args){
    getInteger(3,9);
}

    public static int getInteger(int min,int max){
        Scanner sc = new Scanner(System.in);
        String playAgain = "";
        int userInput;
        do {
            System.out.println("please enter a number: ");
            userInput = sc.nextInt();
    
            if (userInput >= min && userInput <= max) {
                System.out.println("in range!");
            } else {
                System.out.println("sorry not in range");
            }
            System.out.println("try again [yes/no]");
            playAgain = sc.next();
        } while (playAgain.equals("yes"));
        return userInput;
    
    }
  
      
}
