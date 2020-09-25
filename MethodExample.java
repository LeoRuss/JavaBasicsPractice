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
    System.out.println(fname + " Morphine");
  }

  // method with multiple parameters
  static void myThirdMethod(String fName, int age) {
    System.out.println(fName + " is " + age);
  }

  // method that returns a value like int, char etc.
  static int myIntMtd(int x) {
    return 3 + x;
  }

  // return method with two parameters
  static int mySecIntMtd(int x, int y) {
    return x * y;
  }

  // a method that checks users age
  static void checkAge(int age) {

    // if age less than 18, deny access
    if (age < 18) {
      System.out.printf("Access Denied, You are %d.", age);
    } else {
      System.out.println("Access Granted");
    }
  }

  public static void main(String[] args) {
    myMethod();

    mySecondMethod("Dante");
    mySecondMethod("Leon");
    mySecondMethod("Kiyle");

    myThirdMethod("\nHamza", 18);
    myThirdMethod("Sydney", 31);
    myThirdMethod("Allham", 20);

    System.out.println();
    System.out.println("Single parameter: " + myIntMtd(6));
    System.out.println("Double parameter: " + mySecIntMtd(3, myIntMtd(6)));

    // method result can be stored in a variable for improved readablity
    int mthdResult = mySecIntMtd(4, myIntMtd(5));
    System.out.println("Stored in variable: " + mthdResult);

    checkAge(20);
    checkAge(17);
  }
}
