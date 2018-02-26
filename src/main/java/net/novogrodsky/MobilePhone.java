package net.novogrodsky;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents a mobile phone.
 */
public class MobilePhone {

  // to retrieve user cl input
  private static Scanner scanner = new Scanner(System.in);

  private static ArrayList<Contact> contacts = new ArrayList<Contact>();

  //

  public static void start() {
    boolean quit = false;
    int choice = 0;

    // print the instructions
    printInstructions();

    // start this processing loop
    while (!quit) {
      System.out.println("Enter your choice:");
      choice = scanner.nextInt();
      scanner.nextLine();

      // list the options for the main menu
      // TODO: check the input is valid.
      switch (choice) {
        case 0:
          printInstructions();
          break;
        case 1:
          printContacts();
          break;
        case 2:
          addContact();
          break;
        case 3:
          modifyContact();
          break;
        case 4:
          removeContact();
          break;
        case 5:
          quitPhone();
          break;
        default:
          System.out.println("Please enter a number associated with a menu option.");
      }
    }
  }

  public static void quitPhone() {

  }

  public static void removeContact() {

  }

  public static void modifyContact() {
  }

  public static void addContact() {
  }

  /**
   * This method prints the contacts stored in the phone.
   */
  public static void printContacts() {
    System.out.println("You have " + contacts.size() + " contacts in your phone");
    for (int i = 0; i < contacts.size(); i++) {
      System.out.println((i + 1) + ". " + contacts.get(i));
    }

  }

  /**
   * Printing the instructions for the phone to the System.out
   */
  public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print the list of contacts.");
    System.out.println("\t 2 - To add a contact to the phone.");
    System.out.println("\t 3 - To modify a contact in the phone.");
    System.out.println("\t 4 - To remove a contact from the phone.");
    System.out.println("\t 5 - To search for a contact in the list.");
    System.out.println("\t 6 - To quit the phone.");
  }

}
