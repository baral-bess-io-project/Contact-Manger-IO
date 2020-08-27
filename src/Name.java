import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Name  {

    static Scanner scan = new Scanner(System.in);
    static String userInput = scan.nextLine();
   // Name n = new Name();

    public static Path p = Paths.get("./src/contacts.txt").normalize();

    //    creating or declaring  variables
    List<Contacts> contacts;


//read the contents of the instructor-names.txt file and store the list of strings into the 'names' variable

    public static void main(String[] args) {
        System.out.println("Enter an option (1, 2, 3, 4 or 5):");
        System.out.println("1. View contacts. ");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");


        //read out the file
        try {
            List<String> lines = Files.readAllLines(p);
            System.out.println("Name       | Phone number |");
            System.out.println("***************************");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }

//        addNewContacts();

    }

    public static void addNewContacts() {
        try {
            Files.write(p, Arrays.asList(userInput), StandardOpenOption.APPEND);
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
        }
    }

}
