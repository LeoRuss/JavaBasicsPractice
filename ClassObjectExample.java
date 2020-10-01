public class ClassObjectExample {
  public static void main(String[] args) {
    OtherClass myObj = new OtherClass();
    OtherClass my2Obj = new OtherClass();

    my2Obj.x = 30;
    System.out.println(myObj.x);
    System.out.println(my2Obj.x);
    runObject();
  }

  static void runObject() {
    OtherClass myObject = new OtherClass();

    System.out.println(myObject.x);
  }
}
