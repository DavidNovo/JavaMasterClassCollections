package net.novogrodsky;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents a mobile phone.
 */
public class MobilePhone {

  // to retrieve user cl input
  private static Scanner scanner = new Scanner(System.in);

  private ArrayList<Contact> contacts =  new ArrayList<Contact>();

  //

  public static void printInstructions() {
    System.out.println("\nPress ");
    System.out.println("\t 0 - To print choice options.");
    System.out.println("\t 1 - To print the list of grocery items.");
    System.out.println("\t 2 - To add an item to the list.");
    System.out.println("\t 3 - To modify an item in the list.");
    System.out.println("\t 4 - To remove an item from the list.");
    System.out.println("\t 5 - To search for an item in the list.");
    System.out.println("\t 6 - To quit the application.");
  }

}
