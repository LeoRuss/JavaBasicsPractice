public class ClassObjectExample {
  int x = 5;

  public static void main(String[] args) {
    ClassObjectExample myObj = new ClassObjectExample();

    System.out.println(myObj.x);
    runObject();
  }

  static void runObject() {
    ClassObjectExample myObject = new ClassObjectExample();
    int valueOfMethd = myObject.x;
    System.out.println(valueOfMethd);
  }
}
