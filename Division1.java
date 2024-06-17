package CalcBetter;

public class Division1 implements Calculator {
    @Override
    public double calculate(double a, double b){
//if we were dealing with int instead of double, we would need these lines in comments below.
//        if (b == 0){
//            throw ArithmeticException("Division by zero is not allowed.");
//        }
//Here though Java says float / 0 equals infinity.
// (negative infinity for negative float/0) and
// (positive infinity for positive float/0).
        return a / b;
    }
}
