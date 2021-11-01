package grades;
import java.util.ArrayList;


public class Student {
    private String name;
    private ArrayList<Integer>  grades;
    private Double average;
    
    public Student(String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
    }
    
    public Student(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    };
    public void addGrade(int grade){
        grades.add(grade);
    };
    
    public double getGradeAverage(){
        double total = 0;
        for(Integer grade : grades){
            System.out.println("grade: " + grade);
            total += grade;
        }
        return total/grades.size();
        
    };
    
    public static void main(String[] args) {
        Student laura = new Student("Laura", new ArrayList<>());
        laura.addGrade(80);
        laura.addGrade(90);
        laura.addGrade(94);
        System.out.println("grades: " + laura.grades);
        System.out.println("average: " + laura.getGradeAverage());
        
    }
    
}
