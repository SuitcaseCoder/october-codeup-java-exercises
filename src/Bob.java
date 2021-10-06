import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("start a conversation with Bob: ");
        String userInput = sc.nextLine();
        int inputLength = userInput.length();
        if(userInput.lastIndexOf("?") == inputLength - 1){
            System.out.println("sure.");
        } else if (userInput.lastIndexOf("!") == inputLength - 1){
            System.out.println("woah, chill out!");
        } else if (userInput.equals("")){
            System.out.println("okay rude!");
        } else {
            System.out.println("whatever");
        }

    }
}
