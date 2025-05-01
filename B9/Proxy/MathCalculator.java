package B9.Proxy;

public class MathCalculator  implements Calculator {
    @Override
    public double add(double first, double second) {
        return first + second;
    }

    public double sub(double first, double second) {
        return first - second;
    }

    public double mul(double first, double second) {
        return first * second;
    }

    public double div(double first, double second) {
        return first / second;
    }
}
