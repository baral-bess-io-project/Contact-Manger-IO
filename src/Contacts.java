
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contacts {
    private String names;
    private String phoneNumbers;

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


}
