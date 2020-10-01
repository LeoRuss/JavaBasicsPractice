public class ClassObjectExample {
  public static void main(String[] args) {
    ClassObjectExample myObj = new ClassObjectExample();

    System.out.println(myObj.x);
    runObject();
  }

  static void runObject() {
    ClassObjectExample myObject = new ClassObjectExample();
    ClassObjectExample mySecondObj = new ClassObjectExample();

    System.out.println(myObject.x);
    System.out.println(mySecondObj.x);
  }
}
