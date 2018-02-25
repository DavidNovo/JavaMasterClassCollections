package net.novogrodsky;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Hello world! .
 */
public class App {

  // this scans the command line and accepts user input
  private static Scanner scanner = new Scanner(System.in);

  /**
   * The main method 'nuff said.
   */
  public static void main(String[] args) {
    System.out.println("Hello World!");

    // first part, using the builtin Arrays
    int[] myIntegers = getIntegers(5);
    int[] sorted = sortIntegers(myIntegers);
    printArray(sorted);
  }

  /**
   * This gets the input from the command line.
   */
  public static int[] getIntegers(int capacity) {
    int[] array = new int[capacity];
    System.out.println("Enter " + capacity + " integer values:\r");
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }
    return array;
  }

  /**
   * This outputs the results.
   * @param array The values printed to the console.
   */
  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element " + i + " contents " + array[i]);
    }
  }

  /**
   * This sorts the integers the user entered on the command line.
   * @param array The integers entered on the command line.
   * @return
   */
  public static int[] sortIntegers(int[] array) {
    int[] sortedArray = Arrays.copyOf(array, array.length);

    boolean flag = true;
    int temp;
    while (flag) {
      flag = false;

      for (int i = 0; i < sortedArray.length - 1; i++) {
        if (sortedArray[i] < sortedArray[i + 1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i + 1];
          sortedArray[i + 1] = temp;
          flag = true;
        }
      }
    }

    return sortedArray;
  }

}
