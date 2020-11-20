import java.text.Format;

public class CodeRunnerTests {

  // CodeRunner test week 8.
  private static void week8() {
    // test question 1
    // variables are declared
    // boolean answer;

    // if ((x > z) && (a == b)) {
    // answer = true;
    // } else {
    // answer = false;
    // }
    // System.out.println(answer);

    ///////////////////////////
    // test question 2
    // create a method

    ///////////////////////////
    // test question 3
    int x = 6;

    boolean answer = (((x % 2) == 0) && ((x % 3) == 0)) ? true : false;
    System.out.println(answer);

    //////////////////////////////
    // test question 4
    // create a second method

  }

  /////////////////////////////////////////
  // test question 2
  public static void DoSomeCalculation(double a, double b, double c, double d) {
    System.out.println((a + b) / (c + d));
  }

  /////////////////////////////////////////
  // test question 4
  public static void HowAreYou(String name) {
    String answer = String.format("How are you %s?", name);
    System.out.println(answer);
  }

  public static void main(String[] args) {

    week8();
    DoSomeCalculation(3.0, 2.0, 2.0, 2.0);

    HowAreYou("Dr Swift");
  }
}
