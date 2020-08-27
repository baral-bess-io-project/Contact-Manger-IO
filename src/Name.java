import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Name {

    //default constructor
    public Name() {
    }

    //scanner object
    static Scanner scan = new Scanner(System.in);
    public Name n;

    //path for our txt file
    private Path p = Paths.get("./src/contacts.txt").normalize();

    //creating or declaring  variables
    List<Contacts> contacts;

    //main method
    public static void main(String[] args) throws IOException {
//        System.out.println("Enter an option (1, 2, 3, 4 or 5):");
//        System.out.println("1.   View contacts. ");
//        System.out.println("2.   Add a new contact.");
//        System.out.println("3.   Search a contact by name.");
//        System.out.println("4.   Delete an existing contact.");
//        System.out.println("5.   Exit.");


// ******************calling all the methods


//creating instances of an class
        Name n = new Name();

// calling all the methods to work
        n.readAll();
        n.addNewContacts();
        n.searchContacts();
        n.deleteContacts();

    }

    //******methods for functionality

    //1. view Contacts
    public void readAll() {
        try {
            List<String> lines = Files.readAllLines(p);
            System.out.println("Name       | Phone number |");
            System.out.println("***************************");
            for (String line : lines) {
                System.out.println(line);
            }
            System.out.println("_____________");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    //2. Add new contact
    public void addNewContacts() {
        try {
            System.out.println("To add New contacts ");
            System.out.println("please enter your name  ");
            String addName = scan.nextLine();
            System.out.println("please enter your number  ");
            String addNumber = scan.nextLine();
            System.out.println("The new contact list will be : \n");

            Files.write(p, Arrays.asList(String.format("%s | %s", addName, addNumber)), StandardOpenOption.APPEND);
            readAll();
        } catch (IOException e) {
            System.out.println("something went wrong");
        }
    }

    //3.Search a contact by name
    public void searchContacts() throws IOException {
        try {
            System.out.println("Type name to see the contacts details of a person: ");
            String searchName = scan.next();
            List<String> lines = Files.readAllLines(p);
            for (String line : lines) {
                if (line.contains(searchName)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(" OOps ! something went wrong");
        }
    }

    public void deleteContacts() throws IOException {
        try {
            System.out.println("Type name to delete the contacts information of that person:  ");
            String deleteInfo = scan.next();
            List<String> lines = Files.readAllLines(p);
            for (String line : lines) {
//                if(line.replace(deleteInfo, " ")){
//
//
//                }
            }
            System.out.println("_____________");
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }

}
