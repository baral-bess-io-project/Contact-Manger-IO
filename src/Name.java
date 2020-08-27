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

    public static Path p = Paths.get("./src/contacts.txt").normalize();

    //    creating or declaring  variables
    List<Contacts> contacts;

    public  static void readAll(){
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


//read the contents of the instructor-names.txt file and store the list of strings into the 'names' variable

    public static void main(String[] args) {
        System.out.println("Enter an option (1, 2, 3, 4 or 5):");
        System.out.println("1.   View contacts. ");
        System.out.println("2.   Add a new contact.");
        System.out.println("3.   Search a contact by name.");
        System.out.println("4.   Delete an existing contact.");
        System.out.println("5.   Exit.");


        //read out the file
//        try {
//               List<String> lines = Files.readAllLines(p);
//            System.out.println("Name       | Phone number |");
//            System.out.println("***************************");
//            for (String line : lines) {
//                System.out.println(line);
//            }
//            System.out.println("_____________");
//        } catch (
//                IOException e) {
//            e.printStackTrace();
//        }

        readAll();
        //calling the methods for adding contacts
        addNewContacts();

    }

    public static void addNewContacts() {

        try {
            System.out.println("To add New contacts ");
            System.out.println("please enter your name  ");
            String addName = scan.nextLine() ;
            System.out.println("please enter your number  ");
            String addNumber = scan.nextLine() ;
            System.out.println("The new contact list will be : \n");

            Files.write(p, Arrays.asList(String.format("%s | %s", addName, addNumber)),StandardOpenOption.APPEND);
            readAll();
        } catch (IOException e) {
            //exception handling left as an exercise for the reader
            System.out.println("something went wrong");
        }

    }

}
