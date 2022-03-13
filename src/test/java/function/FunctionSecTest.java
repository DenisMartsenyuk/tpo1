package function;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static java.lang.Math.PI;

public class FunctionSecTest {

    final double EPS = 1.0e-5;

    @ParameterizedTest
    @ValueSource(doubles = {(PI / 2), (3 * PI) / 2, (PI / 2) + 2 * PI, ((3 * PI) / 2) + (2 * PI)})
    @DisplayName("ыфвыаип") //todo назвать
    public void undetermined(double x) {
        Assertions.assertEquals(FunctionSec.calc(x), Double.NaN);
    }

    // ( -3 * Pi / 2 + 2 * Pi * n; - Pi / 2 + 2 * Pi * n )
    @ParameterizedTest
    @ValueSource(doubles = {-19 * PI / 6, -5 * PI / 6, 8 * PI / 6, 17 * PI / 6})
    @DisplayName("ыфвыаип") //todo назвать
    public void firstAreaEq(double x) {
        Assertions.assertEquals(FunctionSec.calc(x), 1 / Math.cos(x), EPS);
    }

    // ( - Pi / 2 + 2 * Pi * n; Pi / 2 + 2 * Pi * n )
    @ParameterizedTest
    @ValueSource(doubles = {-13 * PI / 6, -5 * PI / 6, 10 * PI / 6, 23 * PI / 6})
    @DisplayName("ыфвыаип") //todo назвать
    public void secondAreaEq(double x) {
        Assertions.assertEquals(FunctionSec.calc(x), 1 / Math.cos(x), EPS);
    }
}
