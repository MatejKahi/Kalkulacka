import org.junit.jupiter.api.*;
public class KalkulackaTests {
    @BeforeEach
    public void init() {
        kalkulacka = new Kalkulacka();
    }

    Kalkulacka kalkulacka;

    @Test
    public void testAdd() {
        double result = kalkulacka.add(2, 5);
        Assertions.assertEquals(7, result);
    }

    @Test
    public void testMinus() {
        double result = kalkulacka.minus(5, 2);
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testDivide() throws Exception {
        double result = kalkulacka.divide(10, 2);
        Assertions.assertEquals(5, result);
    }
    @Test
    public void testDivideByZeroThrowException() throws Exception {
      Exception exception = Assertions.assertThrows(Exception.class, ()->{
            kalkulacka.divide(5,0);
        });
      Assertions.assertEquals("Nelze dělit nulou",exception.getMessage());
    }

    @Test
    public void testMultiply() {
        double result = kalkulacka.multiply(10, 2);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void testPower() {
        double result = kalkulacka.power(10, 2);
        Assertions.assertEquals(100, result);
    }
    @Test
    public void testFactorial() throws Exception {
        long result = kalkulacka.factorial(6);
        Assertions.assertEquals(720, result);
    }
    @Test
    public void testFactorialWorksOnlyForNoNegative()throws Exception {
        Exception exception = Assertions.assertThrows(Exception.class, ()->{
            kalkulacka.factorial(-1);
        });
        Assertions.assertEquals("Pod nulou to nejde",exception.getMessage());
    }
}
