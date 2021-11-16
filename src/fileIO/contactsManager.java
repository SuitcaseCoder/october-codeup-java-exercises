package fileIO;

// ✅ data should be kept in a file named contacts.txt
// ✅ ui should allow user to choose options 1 - 5 ()
// ✅ show all contacts
// ✅ add new contact
//  search contact by name
//  delete existing contact
// ✅ each contact should be on its own line
// onStart, all contacts should be read
// restart contacts file on exit


import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.createDirectories;
import static java.nio.file.Files.readAllLines;


public class contactsManager {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        createFile();
        handleUI();
    }
    
    // create contacts.txt
    public static void createFile() throws IOException{
        // name new dir and file
        String directory = "data";
        String filename = "contacts.txt";
        
        // create paths to new dir and file
        Path dataDir = Paths.get("src", "fileIO", directory);
        Path contactsFile = Paths.get("src", "fileIO", directory, filename);
        
        // create directory
        if(Files.notExists(dataDir)){
            Files.createDirectories(dataDir);
        }
        
        // create file
        if(! Files.exists(contactsFile)){
            Files.createFile(contactsFile);
        }
    }
    
//    handle menu
    public static void handleUI() throws IOException{
        Scanner scanner = new Scanner(System.in);
    
        String prompt = "Enter an option (1,2,3,4, or 5): ";
        String op1 = "1: View Contacts";
        String op2 = "2: Add a new contact.";
        String op3 = "3: Search a contact by name.";
        String op4 = "4: Delete an existing contact.";
        String op5 = "5: exit";
        System.out.printf("%s\n %s\n %s\n %s\n %s\n %s\n", prompt, op1, op2,op3,op4,op5);
        int choice = scanner.nextInt();
        System.out.printf("your choice was: %s", choice);
        switch(choice){
            case 1:
                System.out.println("case 1");
                handleViewContacts();
                break;
            case 2:
                System.out.println("case 2");
                addNewContact();
                break;
            case 3:
                System.out.println("case 3");
                searchByName();
                break;
            case 4:
                System.out.println("case 4");
                deleteContact();
                break;
            case 5:
                System.out.println("case 5");
                break;
        }
        
        
    }
    
// handle viewContacts
    public static void handleViewContacts() throws IOException {
        System.out.println("handleViewContacts reached");
        
        Path filepath = Paths.get("src", "fileIO", "data", "contacts.txt");
        List<String> contents =  Files.readAllLines(filepath);
        System.out.println(contents);
    }
    
// handle addNewContact
    public static void addNewContact() throws IOException{
        System.out.println("reached addNewContact");
        Scanner sc = new Scanner(System.in);
        System.out.println("please add a contact name and phone number:");
        // prompt user for contact name and phone number
        String newContact = sc.nextLine();
        String newPhone = sc.nextLine();
        
    
        System.out.printf("new user: %s, new phone: %s", newContact, newPhone);
        // create list to be added
        ArrayList<String> contacts = new ArrayList<>();
        contacts.add(newContact);
        contacts.add(newPhone);
    
        System.out.println(contacts);
        
        // write new contact to file
        Path filepath = Paths.get("src", "fileIO", "data", "contacts.txt");
        Files.write(
                filepath,
                contacts,
                StandardOpenOption.APPEND
        );
        
    }
    
    // handle SearchByName
    public static void searchByName() throws IOException{
        System.out.println("searchByName triggered");
        // prompt user for search item
        Scanner sc = new Scanner(System.in);
        System.out.println("what are you searching for? ");
        String searchItem = sc.nextLine();
        // get data first
        Path filepath = Paths.get("src", "fileIO", "data", "contacts.txt");
        List<String> contacts =  Files.readAllLines(filepath);
        Boolean isMatch = false;
        
        // check input against items in file
        for(String contact : contacts) {
            if (contact.equals(searchItem)) {
                isMatch = true;
            }
        }
        
        if(!isMatch){
            System.out.println("sorry not found");
        } else {
            System.out.printf("you searched for %s, and that's a match in our system", searchItem);
    
        }
    }
    
    // handle deleteContact
    public static void deleteContact() throws IOException{
        System.out.println("delete triggered");
        Scanner sc = new Scanner(System.in);
        // prompt user which user to delete:
        System.out.println("which user would you like to delete?");
        String toDelete = sc.nextLine();
    
        // get data first
        Path filepath = Paths.get("src", "fileIO", "data", "contacts.txt");
        List<String> contacts =  Files.readAllLines(filepath);
        
//        create new array to upload
        ArrayList<String> updatedContacts = new ArrayList<>();
        
        // search for that user
        for(String contact : contacts) {
            if (!contact.equals(toDelete)) {
                updatedContacts.add(contact);
                System.out.println(updatedContacts);
    
            }
        }
        System.out.println(updatedContacts);
        
        Files.write(filepath, updatedContacts);
        System.out.printf("no worries, %s, has been removed. and contacts list has been updated", toDelete);
        
    
    
    }
    
    // handle exit
    public void handleExit(){
    
    }
}
