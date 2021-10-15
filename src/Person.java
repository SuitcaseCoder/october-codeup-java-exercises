public class Person {
    
    // 1. Object Basics:
    private String name;
    
    public String getName(){
        // TODO: return the person's name;
        return this.name;
    }
    
    public void setName(String name){
        // TODO: change the name property to the passed value;
        this.name = name;
        
    }
    
    public void sayHello(){
        //TODO: print a message to the console using the person's name
        System.out.println(this.name);
    }
    
    // constructor:
    Person(String name){
        this.name = name;
    }
    
    // main method:
    public static void main(String[] args) {
        Person Fritz = new Person("Fritz");
        System.out.println(Fritz.name);
    
    
        // Understanding references
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName())); // true
        System.out.println(person1 == person2); //false
    
        Person person3 = new Person("John");
        Person person4 = person3;
        System.out.println(person3 == person4); // true
    
        Person person5 = new Person("John");
        Person person6 = person5;
        System.out.println(person5.getName()); // John
        System.out.println(person6.getName()); // John
        person6.setName("Jane");
        System.out.println(person5.getName()); // Jane
        System.out.println(person6.getName()); // Jane
    }
    
}
