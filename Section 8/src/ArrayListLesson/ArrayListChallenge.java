package ArrayListLesson;
//	06.16.2021

import java.util.ArrayList;
import java.util.Scanner;

class Contact {

	private String name;
	private String phoneNumber;

	public Contact(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	//To create a new contact record
	public static Contact createContact(String name, String phoneNumber) {
		return new Contact(name, phoneNumber);
	}

}//end Contact

class MobilePhone {

	private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName()) >=0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;

    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition <0) {
            System.out.println(oldContact.getName() +", was not found.");
            return false;
        } else if(findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                " already exists.  Update was not successful.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if(foundPosition <0) {
            System.out.println(contact.getName() +", was not found.");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i=0; i<this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >=0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >=0) {
            return this.myContacts.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i=0; i<this.myContacts.size(); i++) {
            System.out.println((i+1) + "." +
                        this.myContacts.get(i).getName() + " -> " +
                        this.myContacts.get(i).getPhoneNumber());
        }

    }

}//end MobilePhone

public class ArrayListChallenge {

	private static Scanner scan = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone("0039 330 4404");

	public static void main(String[] args) {

		boolean quit = false;

		startPhone();
		printActions();

		while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scan.nextInt();
            scan.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
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

	}//end main

	private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scan.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scan.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + " | phone = "+ phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = scan.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = scan.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scan.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                           "1  - to print contacts\n" +
                           "2  - to add a new contact\n" +
                           "3  - to update an existing contact\n" +
                           "4  - to remove an existing contact\n" +
                           "5  - query if an existing contact exists\n" +
                           "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }

}//end class
