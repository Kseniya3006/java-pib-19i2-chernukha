package Lab3;

import java.util.Scanner;

public class Lab3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the expression:");
        double x = Double.parseDouble(scanner.next());
        char operation = scanner.next().charAt(0);
        double y = Double.parseDouble(scanner.next());
        double result = calc(x,operation,y);
        String str = scanner.nextLine();
        System.out.print("The result of the operation: " + result);
    }
    public static double calc(double x, char operation, double y ){
        double result = 0;
        switch (operation) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                if (y == 0)
                    System.out.println("NaN");
                result = x / y;
                break;
            default:
                System.out.println("Incorrect data was entered!");
        }
        return result;
    }
}
