package function;


public class FunctionSec {
    public static double calc (double x) {
        if ((x % (Math.PI / 2) == 0 || x % ((3 * Math.PI) / 2) == 0) && x % Math.PI != 0) {
            return Double.NaN;
        }
        return 1 / calcCos(x);
    }

    private static double reverseFact(int n) {
        if (n == 0) {
            return 1;
        }
        double result = 1.0D;
        for (int i = 1; i <= n; ++i) {
            result /= i;
        }
        return result;
    }

    private static double calcCos(double x) {
        double result = 0.0D;

        double multiplier = x * x;
        double numerator = 1;
        double sign = 1;

        for (int i = 0; i < 100; ++i) {
            result += sign * numerator * reverseFact(2 * i);
            numerator *= multiplier;
            sign = -sign;

        }

        return result;
    }
}
