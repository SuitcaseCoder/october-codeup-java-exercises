package grades;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        
        Student Nick = new Student("Nick", new ArrayList<>());
        Student Schmidt = new Student("Schmidt", new ArrayList<>());
        Student Coach = new Student("Coach", new ArrayList<>());
        Student Winston = new Student("Winston", new ArrayList<>());
        
        Nick.addGrade(49);
        Nick.addGrade(80);
        Nick.addGrade(20);
        
        Schmidt.addGrade(90);
        Schmidt.addGrade(97);
        Schmidt.addGrade(998);

        Coach.addGrade(60);
        Coach.addGrade(72);
        Coach.addGrade(71);
    
        Winston.addGrade(100);
        Winston.addGrade(99);
        Winston.addGrade(100);
    
        students.put("julius_Pepperwood",Nick);
        students.put("Marketing_Guru",Schmidt);
        students.put("Drop_and_give_me_20",Coach);
        students.put("I_love_ferguson",Winston);
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Which student would you like to see more info on?");
        String input = sc.nextLine();
        System.out.println("I'd like to learn more about: " + input);
        
        if(students.containsKey(input)){
            System.out.println(input + " does exist in our system");
            Student chosenStudent = students.get(input);
            
            System.out.println("Student name: " + chosenStudent.getName() + "\n" + "Grades: " + chosenStudent.grades +  "\n" + "Avg: " + chosenStudent.getGradeAverage());
            
        } else {
            System.out.println("sorry that user does not exist.");
        }
        
    
    
    }
}
