import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ControlFlowExercises {

//    // 1. Loop Basics
//    public static void main(String[] args) {
//        // a. While
////        int i = 5;
////        while (i <= 15){
////            System.out.println(i);
////            i++;
////        }
//
//        // b. do while
////        int num = 0;
////        do {
////            num = num + 2;
////            System.out.println(num);
////        } while (num < 100);
//
////            int num = 100;
////            do {
////                num = num - 5;
////                System.out.println(num);
////            } while (num > -10);
//
////            long num = 2;
////            do {
////                num = num * num;
////                System.out.println(num);
////            } while (num < 100);
//
//        // c. For loop
////        for(int i = 5; i <= 15; i++){
////            System.out.println(i);
////        };
//
////        for (long i = 2; i <= 1000000; i*=i){
////            System.out.println(i);
////        }

//    }
    
    
    // 2. Fizzbuzz
//    public static void main(String[] args) {
//        for(int i = 1; i <= 100; i++){
//            System.out.println(" ---- new ---- " + i);
//            if(i % 3 == 0 &&  i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 ==0 ) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println("not divisible by 3 nor 5");
//            }
//
//        }
//    }
    
    // 3. Display a table of powers
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("What number would you like to go up to?: \n");
//        int userInput = sc.nextInt();
//        System.out.println(" number  |  squared |  cubed ");
//        System.out.println(" ------  | -------  | ------ ");
//
//        for(int i = 1; i < userInput; ++i){
//            int squared = i * i;
//            int cubed = i * i * i;
//            System.out.printf("  %s   |   %s   |   %s    \n", i, squared, cubed);
//        }
//
//    }
    
    // 4. Convert given number grades into letter grades
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // keep going only if user wants to
        String keepGoing = "y";
        do {
            // prompt user for grade 0 - 100
            System.out.println("Please enter a number from 0 to 100:");
            int grade = sc.nextByte();
            // display corresponding letter grade
            if (grade <= 100 && grade >= 88) {
                System.out.println("Your letter grade is an A! Great job!");
            } else if (grade <= 87 && grade >= 80) {
                System.out.println("Your letter grade is an B! Good job!");
            } else if (grade <= 79 && grade >= 67) {
                System.out.println("Your letter grade is an C! You Did it!");
            } else if (grade <= 66 && grade >= 60) {
                System.out.println("Your letter grade is an D! Better luck next time!");
            } else if (grade <= 59 && grade >= 0) {
                System.out.println("Your letter grade is an F! time to start study!");
            }
            System.out.println("Would you like to continue? [y/n]");
            keepGoing = sc.next();
        } while (keepGoing.equals("y"));
    }
    
}
