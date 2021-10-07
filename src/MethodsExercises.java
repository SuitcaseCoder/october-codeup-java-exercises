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
    
    // 3. Calculate the factorial of a number:
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number between 1 and 10");
        int userInput = sc.nextInt();
        factorial(userInput);
    }
    
    public static void factorial(int num){
        long factorial = num;
        for(int i = 1; i >=1; i--){
            factorial = i * i -1;
            System.out.println(factorial);
        }
        
    }
    
  
      
}
