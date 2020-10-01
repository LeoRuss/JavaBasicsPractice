public class OtherClass {
  // x is an attribute of the class or a variables within a class
  // class attributes are also known as "fields"
  // putting final before assiging variables won't allow users to change it
  final int x = 5;
  int y;

  String fname = "Leon";
  String lname = "Doe";
  int age = 25;

  public static void main(String[] args) {

    ClassObjectExample newCar = new ClassObjectExample();
    newCar.fullThrottle();
    newCar.speed(250);
  }
}
