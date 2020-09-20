public class LoopsEg {
  public static void main(String[] args) {
    /* while loop which checks the argument everytime it runs
    while(condition) {
      code block to be executed }
    */
    int i = 0; 
    while (i < 5) {
      System.out.println("While loop: " + i);
      i++;
    }
    System.out.println(); //newline

    // do/while loop; a variant of while loop.
    // This loop will execute the code block once
    /* 
    do {
      //code block;
    }
    while (condition);
    */
    int x = 0;
    do {
      System.out.println("Do/while loop: " + x);
      x++;
    }
    while (x < 5);
    System.out.println();

    /* Example of For loop
     for (statement 1; statement 2; statement 3) {
      //code block to be executed
    } */
    for (int y = 0; y < 5; y++) {
      System.out.println("For loop: " + y);
    }
    System.out.println();

    /*
    For-each loop
    for (type variableName: arrayName) {
      //code block to be executed
    }
    */
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String c : cars) {
      System.out.println(c);
    }
  }
}
