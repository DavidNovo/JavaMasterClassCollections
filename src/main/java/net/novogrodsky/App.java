package net.novogrodsky;


/**
 * Hello world! .
 */
public class App {



  /**
   * The main method 'nuff said.
   */
  public static void main(String[] args) {
    System.out.println("Hello World!");

    // first part, using the built-in Arrays
    int[] myIntegers = BuiltInArray.getIntegers(5);
    int[] sorted = BuiltInArray.sortIntegers(myIntegers);
    BuiltInArray.printArray(sorted);


  }

}
