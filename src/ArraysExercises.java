import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        
        // 1. Array Basics
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        
        // create an array that holds 3 Person objects
        
        // the only reason we can create a new `Person` is because its a `public` class that we have access to
        Person[] persons = new Person[3];
        persons[0] = new Person("Fritz Opolous");
        persons[1] = new Person("Shiner Bear");
        persons[2] = new Person("Chaz E. Chaz");
        
        // iterate through the array and print name of each person
        // hint: look at your "Person" class!
        for (Person person : persons){
            System.out.println(person.getName());
        }

        // addPerson();
        addPerson(persons, new Person("Rose ee"));
    }
    
    // create a static method that returns an array whose length is 1 greater than the passed array
    public static Person[] addPerson(Person[] personArr, Person newPerson){
        int length = personArr.length;
        personArr[length - 1] = newPerson;
        return personArr;
    }
    
}
