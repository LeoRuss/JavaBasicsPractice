class Main2 {
  public static void main(String[] args) {
    // if..else statements examples
    int time = 20;
    if (time > 18) {
      System.out.println("Good day");
    } else {
      System.out.println("Good Evening.");
    }
    // short hand if..else
    // variable = (condition) ? expressionTrue : expressionFalse;
    String result = (time < 18) ? "Good day." : "Good evening.";
    System.out.println(result);
  }
}