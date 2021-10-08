package Lab3;

import java.util.Scanner;
import java.util.Objects;

public class Lab3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the expression:");
        double x = Double.parseDouble(scanner.next());
        char operation = scanner.next().charAt(0);
        double y = Double.parseDouble(scanner.next());
        double result = calc(x,operation,y);
        String str = scanner.nextLine();
        if (Objects.equals(str, "")) {
            System.out.println("The result of the operation: " + result);
        } else {
            System.out.println("Invalid expression entered!");
        }
    }
    public static double calc(double x, char operation, double y ){
        switch (operation) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                if (y == 0)
                    return Double.NaN;
                else return x / y;
            default:
                return Double.NaN;
        }
    }
}
