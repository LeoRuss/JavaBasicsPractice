public class RecursionExample {

  /**
   * Recursion is the technique of making a function call itself. It provides a
   * way to break complicated problems into simpole problems that are easier to
   * solve.
   */
  public static void main(String[] args) {
    int result = sum(10); // calles the sum() method with 1 argument
    System.out.println("Result: " + result);
  }

  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
    // checks the parameter k and compares if greater than 0, runs if true
    /*
     * returns the value of k and calls another instance of the sum() method until
     * the value of k is less than zero.
     */
    //
    // k = 10;
    // 10 + sum(9);
    // 10 + (9 + sum(8));
    // 10 + (9 + (8 + sum(7)));
    // 10 + (9 + (8 + (7 + sum(6))));
    // 10 + (9 + (8 + (7 + (6 + sum(5))));
    // 10 + (9 + (8 + (7 + (6 + (5 + sum(4))));
    // 10 + (9 + (8 + (7 + (6 + (5 + (4 + sum(3))));
    // 10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + sum(2))));
    // 10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + sum(1))));
    // 10 + (9 + (8 + (7 + (6 + (5 + (4 + (3 + (2 + (1 + sum(0))));
    // k is less than 0, so the method stops and returns 0;
    //
    // Simple: 10+9+8+7+6+5+4+3+2+1+0
    // Output = 55
  }
}
