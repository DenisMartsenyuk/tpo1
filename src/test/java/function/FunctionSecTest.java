package function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.Math.PI;

public class FunctionSecTest {

    private final double EPS = 1.0e-5;

    @ParameterizedTest
    @ValueSource(doubles = {(PI / 2), (3 * PI) / 2, (PI / 2) + 2 * PI, ((3 * PI) / 2) + (2 * PI)})
    @DisplayName("Test function by NaN result")
    public void nanTest(double x) {
        Assertions.assertEquals(FunctionSec.calc(x), Double.NaN);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9})
    @DisplayName("Test function in doubles values")
    void doublesTest(double x) {
        Assertions.assertEquals(FunctionSec.calc(x), 1 / Math.cos(x), EPS);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-19 * PI / 6, -5 * PI / 6, 8 * PI / 6, 17 * PI / 6})
    @DisplayName("Test function in PI values")
    public void piTest(double x) {
        Assertions.assertEquals(FunctionSec.calc(x), 1 / Math.cos(x), EPS);
    }
}
