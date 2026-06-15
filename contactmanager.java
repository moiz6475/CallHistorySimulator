import java.util.LinkedList;

public class contactmanager {

    private LinkedList<contact> contacts = new LinkedList<>();

    public void addContact(String name, String number) {
        contacts.add(new contact(name, number));
        System.out.println("Contact Added Successfully!");
    }

    public void displayContacts() {

        if (contacts.isEmpty()) {
            System.out.println("No Contacts Found.");
            return;
        }

        for (contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void searchContact(String name) {

        for (contact contact : contacts) {

            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact Found:");
                System.out.println(contact);
                return;
            }
        }

        System.out.println("Contact Not Found.");
    }

    public void deleteContact(String name) {

        for (contact contact : contacts) {

            if (contact.getName().equalsIgnoreCase(name)) {
                contacts.remove(contact);
                System.out.println("Contact Deleted.");
                return;
            }
        }

        System.out.println("Contact Not Found.");
    }
}