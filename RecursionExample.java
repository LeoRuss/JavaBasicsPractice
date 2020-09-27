public class RecursionExample {

  /**
   * Recursion is the technique of making a function call itself. It provides a
   * way to break complicated problems into simpole problems that are easier to
   * solve.
   */
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println("Result: " + result);
  }

  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
  }
}
