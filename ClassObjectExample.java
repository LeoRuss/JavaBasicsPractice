public class ClassObjectExample {
  public static void main(String[] args) {
    OtherClass myObj = new OtherClass();
    OtherClass my2Obj = new OtherClass();

    my2Obj.y = 50;

    System.out.println(myObj.x); // output: 33
    System.out.println(my2Obj.y); // output: 50
    runObject(); // output: 5
  }

  static void runObject() {
    OtherClass myObject = new OtherClass();

    System.out.println(myObject.x);
  }
}
