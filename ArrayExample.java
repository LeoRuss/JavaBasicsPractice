public class ArrayExample {
  public static void main(String[] args) {
    // to make array use "[]"brackets e.g. String[] cars;
    String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
    cars[0] = "Opel"; // changes element in index 0 from "Volvo" to "Opel"
    System.out.println(cars[0]);
    System.out.println(cars.length);

    // to make integer array, e.g. int[] myNum;
    int[] myNum = { 10, 20, 30, 40 };
    System.out.println(myNum[3]);
    System.out.println();

    // Multidimensional Arrays; array that contains one or more arrays
    // to create two-dimensional array:
    // type[][] variable = {{elements...},{elements..}};
    int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
    int x = myNumbers[0][0];
    int y = myNumbers[1][3];

    String subarr1 = String.valueOf(x); // convert int to string using String method
    String subarr2 = String.valueOf(y);
    System.out.println(subarr1 + " and " + subarr2);
    System.out.println();

    // using for loop inside for loop to get elements to two-dimensional array
    for (int arr1 = 0; arr1 < myNumbers.length; ++arr1) {
      for (int arr2 = 0; arr2 < myNumbers[arr1].length; ++arr2) {
        System.out.println(myNumbers[arr1][arr2]);
      }
    }

  }
}
