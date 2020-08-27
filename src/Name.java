import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Name  {
    public static Path p = Paths.get("./src/contacts.txt").normalize();

    //    creating or declaring  variables
    List<Contacts> contacts;


//read the contents of the instructor-names.txt file and store the list of strings into the 'names' variable

    public static void main(String[] args) {
            //read out the file
        try {
            List<String> lines = Files.readAllLines(p);
            for(String line : lines){
                System.out.println(line);
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }
//        System.out.println("Enter an option (1, 2, 3, 4 or 5):");
//        System.out.println("1. View contacts. ");
//        System.out.println("2. Add a new contact.");
//        System.out.println("3. Search a contact by name.");
//        System.out.println("4. Delete an existing contact.");
//        System.out.println("5. Exit.");
//        Scanner scan = new Scanner(System.in);
//        int userInput = scan.nextInt();
//        System.out.println(userInput);
        //System.out.println(p);



    }
}
