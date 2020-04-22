import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilephone = new MobilePhone("0992595337");

    public static void main(String[] args) {
        System.out.println(" 107. ArrayList Challenge Part 1 ");

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("\n Enter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nShuting down...");
                    quit=true;
                    break;
                case 1:
                    mobilephone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
    private static void addNewContact(){
        System.out.println(" Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println(" Enter new phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContacts(name,phoneNumber);
        if(mobilephone.addNewContact(newContact)){
            System.out.println(" New contact added: name = "+name+", phone"+phoneNumber);
        }else{
            System.out.println(" Cannot add, "+name+" already on file");
        }
    }

    private static void startPhone() {
        System.out.println(" Starting phone... ");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress ");
        System.out.println(" 0 - to shutdown \n" +
                " 1 - to print contacts \n+" +
                " 2 - to add to add a new contact \n" +
                " 3 - to apdate an existing contact \n" +
                " 4 - to remove an existing contact \n" +
                " 5 - query if an existing contact exist \n" +
                " 6 - to print a list of available contacts. ");
        System.out.println("Choose your action: ");
    }
}
