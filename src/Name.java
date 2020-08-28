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
    //public static Name n;

    //path for our txt file
    private Path p = Paths.get("./src/contacts.txt").normalize();

    //creating or declaring  variables
    List<Contacts> contacts;

    //main method
    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to our Contacts Information System");
        System.out.println("Here are the options you want to work with:");
        System.out.println("Enter an option (1, 2, 3, 4 or 5):");

        // ******************Calling all the methods using switch statement
        int selectOption = scan.nextInt();
        Name n = new Name();
        switch (selectOption) {
            case 1:
                n.readAll();
                break;
            case 2:
                n.addNewContacts();
                break;
            case 3:
                n.searchContacts();
                break;
            case 4:
                n.deleteContacts();
                break;
            case 5:
                n.exitTheMenu();
                break;
            default:
                System.out.println("Please select the options 1-5:");

        }

//        System.out.println("1.   View contacts. ");
//        System.out.println("2.   Add a new contact.");
//        System.out.println("3.   Search a contact by name.");
//        System.out.println("4.   Delete an existing contact.");
//        System.out.println("5.   Exit.");

//creating instances of an class
//        Name n = new Name();

    }


    //******methods for functionality

    //1. view Contacts
    public void readAll() {
        try {
            List<String> lines = Files.readAllLines(p);
            System.out.println("Name       | Phone number |");
            System.out.println("***************************");
            for (int i = 0; i < lines.size(); i += 1) {
                System.out.println((i + 1) + ". " + lines.get(i));
            }
            System.out.println("_____________");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    //2. Add new contact
    public void addNewContacts() throws IOException {
        try {
            System.out.println("To add New contacts ");
            System.out.println("please enter your name  ");
            String addName = scan.nextLine();
            System.out.println("please enter your number  ");
            String addNumber = scan.nextLine();
            System.out.println("The new contact list will be : \n");

            Files.write(p, Arrays.asList(String.format("%s | %s ", addName, addNumber)), StandardOpenOption.APPEND);
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
                if (line.toLowerCase().contains(searchName.toLowerCase())) {
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
                if (line.toLowerCase().contains(deleteInfo.toLowerCase())) {
                    lines.remove(line);
                    break;
                }
            }
            Files.write(p, lines);
            readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitTheMenu() throws IOException {
        System.out.println("Are you sure you want to exit the game\n If yes: enter Y= Yes and N= No ");
        String exit = scan.next();
        if (exit.equalsIgnoreCase("Y")) {
            System.exit(0);
        }
    }

}
