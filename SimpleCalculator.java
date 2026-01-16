import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            String firstInput = sc.nextLine();
            double firstNum = Double.parseDouble(firstInput);

            System.out.print("Enter the second number: ");
            String secondInput = sc.nextLine();
            double secondNum = Double.parseDouble(secondInput);

            System.out.print("Enter an operator (+, -, *, /): ");
            String op = sc.nextLine();
            double ans;

            switch (op) {
                case "+":
                    ans = firstNum + secondNum;
                    System.out.println("Result: " + ans);
                    break;
                case "-":
                    ans = firstNum - secondNum;
                    System.out.println("Result: " + ans);
                    break;
                case "*":
                    ans = firstNum * secondNum;
                    System.out.println("Result: " + ans);
                    break;
                case "/":
                    if (secondNum == 0) {
                        throw new ArithmeticException("Cannot divide by zero.");
                    }
                    ans = firstNum / secondNum;
                    System.out.println("Result: " + ans);
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
            }
        } catch (NumberFormatException ex) {
            System.out.println("Error: Please enter valid numeric values.");
        } catch (ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("Calculation finished.");
            sc.close();
        }
    }
}
