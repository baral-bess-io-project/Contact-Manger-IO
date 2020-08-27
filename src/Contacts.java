

import java.util.Scanner;

public class Contacts {
    public String names;
    public String phoneNumbers;

    //constructor of class
    public Contacts(String names, String phoneNumbers) {
        this.names = names;
        this.phoneNumbers = phoneNumbers;
    }

// getter and setter for names, phone numbers
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

//    creating path for contact.txt


    public static void main(String[] args) {
        System.out.println("Enter an option (1, 2, 3, 4 or 5):");
        System.out.println("1. View contacts. ");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        System.out.println(userInput);


    }
}
