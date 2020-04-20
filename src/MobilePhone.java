import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println(" Contact is already on file ");
            return false;
        }
        this.myContact.add(contact);
        return true;
    }

    public boolean  updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else {
            System.out.println(oldContact.getName()+
                    " was replaced with "+
                    newContact.getName());
            this.myContact.set(foundPosition, newContact);
            return true;
        }
    }

    private int findContact(String ContactName) {
        for (int i = 0; i < myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            if (contact.getName().equals(contact)) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact) {
        return this.myContact.indexOf(contact);
    }
}
