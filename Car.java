public class Car {
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car newCar = new Car(1969, "Mustang");
    System.out.println(newCar.modelYear + " " + newCar.modelName);
    
    Car myCar = new Car(2010, "Ford");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
