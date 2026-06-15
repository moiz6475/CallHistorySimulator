import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        contactmanager contactManager = new contactmanager();
        missedcalls missedCalls = new missedcalls();
        recentcalls recentCalls = new recentcalls();
        favouritecontacts favouritecontacts = new favouritecontacts();

        int choice;

        do {

            System.out.println("\n===== CALL HISTORY SIMULATOR =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Add Outgoing Call");
            System.out.println("6. Add Missed Call");
            System.out.println("7. Show Recent Calls");
            System.out.println("8. Show Missed Calls");
            System.out.println("9. Add Favorite Contact");
            System.out.println("10. Show Favorite Contacts");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Number: ");
                    String number = input.nextLine();

                    contactManager.addContact(name, number);
                    break;

                case 2:

                    contactManager.displayContacts();
                    break;

                case 3:

                    System.out.print("Enter Name To Search: ");
                    String searchName = input.nextLine();

                    contactManager.searchContact(searchName);
                    break;

                case 4:

                    System.out.print("Enter Name To Delete: ");
                    String deleteName = input.nextLine();

                    contactManager.deleteContact(deleteName);
                    break;

                case 5:

                    System.out.print("Enter Caller Name: ");
                    String outName = input.nextLine();

                    System.out.print("Enter Number: ");
                    String outNumber = input.nextLine();

                    call outgoingCall =
                            new call(outName, outNumber, "Outgoing");

                    recentCalls.addCall(outgoingCall);

                    System.out.println("Outgoing Call Added.");
                    break;

                case 6:

                    System.out.print("Enter Caller Name: ");
                    String missName = input.nextLine();

                    System.out.print("Enter Number: ");
                    String missNumber = input.nextLine();

                    call missedCall =
                            new call(missName, missNumber, "Missed");

                    missedCalls.addMissedCall(missedCall);

                    recentCalls.addCall(missedCall);

                    break;

                case 7:

                    recentCalls.showRecentCalls();
                    break;

                case 8:

                    missedCalls.showMissedCalls();
                    break;

                case 9:

                    System.out.print("Enter Favorite Contact Name: ");
                    String favName = input.nextLine();

                    favouritecontacts.addFavorite(favName);
                    break;

                case 10:

                    favouritecontacts.displayFavorites();
                    break;

                case 0:

                    System.out.println("Program Closed.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 0);

        input.close();
    }
}