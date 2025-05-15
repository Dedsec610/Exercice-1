public class Main {
    public static void main(String[] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.name = "Hitler";
        contact1.phoneNumber = "0102805620";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Momo";
        contact2.phoneNumber = "0142993406";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "Bak";
        contact3.phoneNumber = "0798461892";
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.name = "Julie";
        contact4.phoneNumber = "0788989517";
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.name = "Nata";
        contact5.phoneNumber = "0170810507";
        myContactsManager.addContact(contact5);

        // Rechercher un contact
        Contact result = myContactsManager.searchContact("Bak");
        if (result != null) {
            System.out.println("Numéro de " + result.name + " est " + result.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}
