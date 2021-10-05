import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        // 1.
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s \n", pi);
        // %f --> float
        System.out.format("The value of pi is approximately: %f%n", pi);
        
        // Explore the *Scanner* Class
        Scanner sc = new Scanner(System.in);
    
        // 1.
//        System.out.println("Please enter an integer");
//        int userInt = sc.nextInt();
//        System.out.printf("here's your num: %s", userInt);
        
        // 2.
//        System.out.println("Please enter three words");
//        String firstWord = sc.next();
//        String secondWord = sc.next();
//        String thirdWord = sc.next();
//        System.out.printf("here's your three words: %n%s%n%s%n%s", firstWord,secondWord,thirdWord);
        
        // 3.
//        System.out.println("Please enter a sentence");
//        String sentence = sc.nextLine();
//        System.out.printf("here's your sentence: %s", sentence);
        
        // Calculate the perimeter and area of Codeup's classroom
        // 4.
        System.out.println("please enter the length and width and height of your desk:");
        float length = Float.parseFloat(sc.nextLine());
        float width = Float.parseFloat(sc.nextLine());
        float area =  length * width;
        float height = Float.parseFloat(sc.nextLine());
        float perimeter = (length * 2) + (width * 2);
        float volume = length * width * height;
        System.out.printf("The area of your inputs are: %s%n. The perimeter is: %s%n. The volume is: %s%n.", area, perimeter, volume);
    
    }
}
