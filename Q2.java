public class Q2 {
          public static void main(String[] args) {
                    System.out.println("Name: Abhishek Bhatta and CRN:019-312");
                    try {
                              int a = Integer.parseInt(args[0]);
                              int b = Integer.parseInt(args[1]);
                              int c = a / b;
                              System.out.println(c);
                    } catch (NumberFormatException e) { // catch block for NumberFormatException
                              System.out.println("Invalid input");
                    } catch (ArithmeticException e) { // catch block for ArithmeticException
                              System.out.println("Division by zero");
                    } catch (ArrayIndexOutOfBoundsException e) { // catch block for ArrayIndexOutOfBoundsException
                              System.out.println("Invalid input");
                    } finally { // finally block
                              System.out.println("Program executed successfully");
                    }
          }
}
