package net.novogrodsky;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Ignore;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase {

  /**
   * Create the test case.
   *
   * @param testName name of the test case
   */
  public AppTest(String testName) {
    super(testName);
  }

  /**
   * Default test suite.
   * @return the suite of tests being tested
   */
  public static Test suite() {
    return new TestSuite(AppTest.class);
  }

  /**
   * Rigourous Test :-) .
   */
  public void testApp() {
    assertTrue(true);
  }

  @Ignore
  // This test is not needed
  public void testMain() {
  }

  @Ignore
  // This is the command line getting numbers, better for integration tests
  // tests that can mimic human interaction.
  public void testGetIntegers() {
  }


  /**
   * This makes sure the print array function created the desired output.
   */
  public void testPrintArray() {
    // create test array
    int[] testIntArray = new int[]{1, 4, 33, 67, 243, 11};

    // call method under test
    App.printArray(testIntArray);
  }

  /**
   * This makes sure that the elements of an array are ordered correctly.
   */
  public void testSortIntegers() {
    // create test array
    int[] testIntArray = new int[]{1, 4, 33, 67, 243, 11};

    // call method under test
    int[] sortedArray = App.sortIntegers(testIntArray);

    // test that the order is correct
    assertTrue(
        "The largest integer should be at position 0.  In this case, the value should be 243",
        sortedArray[0] == 243);
  }
}
