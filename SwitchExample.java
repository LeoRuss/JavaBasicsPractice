public class SwitchExample {  
  public static void main(String[] args) {
    /* Switch Statements examples
    switch(expression) {
      case x:
        code
        break; // stops the execution of more code and case testing inside the block
      case y:
        code
        break;
      default: // execute this if no case is matched
        code
    } 
    */
    int day = 4;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
    }
  }
}
