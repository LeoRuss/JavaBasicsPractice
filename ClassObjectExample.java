public class ClassObjectExample {
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


    runObject(); // output: 5
  }

  static void runObject() {
    OtherClass myObject = new OtherClass();

    System.out.println(myObject.x);
  }
}
