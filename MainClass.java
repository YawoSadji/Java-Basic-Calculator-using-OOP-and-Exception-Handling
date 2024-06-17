package CalcBetter;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter first number");
            double firstNumber = scan.nextDouble();
            System.out.println("Enter second number");
            double secondNumber = scan.nextDouble();
            scan.nextLine();
            System.out.println("Select operation (+,-,*,/)");
            String selectedOperation = scan.nextLine();
            Calculator calc1;
            switch (selectedOperation){
                case "+":
                    calc1 = new Addition1();
                    break;
                case "-":
                    calc1 = new Subtraction1();
                    break;
                case "*":
                    calc1 = new Multiplication1();
                    break;
                case "/":
                    calc1 = new Division1();
                    break;
                default:
                    System.out.println("Invalid operation");
                    return;//return exits the main method if invalid operation is provided
                //if we used break, it would only exit the try block
                //and try to run the rest of the code and that will cause issues.
            }
            double result = calc1.calculate(firstNumber, secondNumber);
            System.out.println(String.format("%f %s %f = %f.",firstNumber, selectedOperation, secondNumber, result));
        } catch (Exception e){
            System.out.println("An error occurred" + e.getMessage());
        } finally {
                scan.close();
        }
    }
}
