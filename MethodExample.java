public class MethodExample {

  // method or function which can be called using myMethod()
  static void myMethod() {
    System.out.println("myMethod() just got executed!");
    System.out.println("\nStart");

    int i = 0;
    while (i < 5) {
      System.out.println("Hi!");
      i++;
    }
    System.out.println("End\n");
  }

  // second method which takes one argument of type String
  static void mySecondMethod(String fname) {
    System.out.println(fname + " Rai");
  }

  public static void main(String[] args) {
    myMethod();
    mySecondMethod("Russel");
    mySecondMethod("Leon");
    mySecondMethod("Kiyle");
  }
}