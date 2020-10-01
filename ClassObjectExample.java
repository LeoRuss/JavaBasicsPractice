public class ClassObjectExample {
  public static void main(String[] args) {
    OtherClass myObj = new OtherClass();

    System.out.println(myObj.x);
    runObject();
  }

  static void runObject() {
    OtherClass myObject = new OtherClass();
    OtherClass mySecondObj = new OtherClass();

    System.out.println(myObject.x);
    System.out.println(mySecondObj.x);
  }
}
