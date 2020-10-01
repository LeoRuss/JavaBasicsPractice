public class ClassObjectExample {

  static void runObject() {
    OtherClass myObject = new OtherClass();

    System.out.print(myObject.x);
    System.out.println(" This is static method");
  }

  public void myPublicMthd() {
    System.out.println("This is a public method");
  }

  public void fullThrottle() {
    System.out.println("This car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  public static void main(String[] args) {
    OtherClass myObj = new OtherClass();
    OtherClass my2Obj = new OtherClass();
    OtherClass person = new OtherClass();

    my2Obj.y = 50;
    myObj.y = 2;

    System.out.println(myObj.x); // output: 5
    System.out.println(my2Obj.y); // output: 50
    System.out.println(myObj.y); // output: 2

    System.out.println("\nName: " + person.fname + " " + person.lname);
    System.out.println("Age: " + person.age + "\n");

    // calling static method
    runObject(); // output: 5

    // public method must be called using object
    ClassObjectExample newMethod = new ClassObjectExample();
    newMethod.myPublicMthd();
    System.out.println();

    ClassObjectExample myCar = new ClassObjectExample();
    myCar.fullThrottle();
    myCar.speed(200);

  }
}
