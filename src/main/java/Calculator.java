public class Calculator {

    public int Add(int num1, int num2) {
        return num1 + num2;
    }

    public int Subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int Multiply(int num1, int num2) {
        return num1 * num2;
    }

    public double Divide(double num1, double num2) {
        double result = Math.round((num1 / num2) * 100.0) / 100.0;
        return result;
    }

}
