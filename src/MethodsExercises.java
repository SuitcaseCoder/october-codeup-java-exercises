import java.util.Scanner;
import java.lang.Math;

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
//public static void main(String[]args){
//    getInteger(3,9);
//}
//
//    public static int getInteger(int min,int max){
//        Scanner sc = new Scanner(System.in);
//        int userInput;
//            System.out.println("please enter a number: ");
//            userInput = sc.nextInt();
//
//            if (userInput >= min && userInput <= max) {
//                System.out.println("in range!");
//            } else {
//                System.out.println("sorry not in range");
//                getInteger(3, 10);
//            }
//        return userInput;
//
//    }
    
//     // 3. Calculate the factorial of a number:
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter a number between 1 and 10");
//        int number = sc.nextInt();
//        factorial(number);
//    }
////
//    public static void factorial(int num){
//        // for loop
////        long factorial = 1;
////        for(int i = 1; i <= num;  i++){
////            factorial = factorial * i;
////            System.out.println(factorial);
////        }
//
//        // while loop
//        long factorial = 1;
//        int i = 1;
//        while (i <= num){
//            System.out.println(factorial + " * " + i + " = " + factorial * i);
//            factorial = factorial * i;
//            i++;
//        }
//        System.out.println("factorial of : " + num + " is: " + factorial);
//
//
//    }
    
//     // 4. Create an application that simulates dice rolling
//    public static void main(String[] args) {
//        dicePlay();
//    }
//
//
//    public static void dicePlay() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("please enter the number of sides for a pair of dice: ");
//        int userInput = sc.nextInt();
//        String playAgain = "";
//        do {
//            userInput +=1;
//            int first = (int) (Math.random() * userInput);
//            int second = (int) (Math.random() * userInput);
//            System.out.println(first + " " + second);
//            System.out.println("do you want to play again?[y/n]");
//            playAgain = sc.next();
//        } while (playAgain.equals("y"));
//    }

}
