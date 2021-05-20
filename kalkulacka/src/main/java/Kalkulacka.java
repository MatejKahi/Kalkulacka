public class Kalkulacka {
    public double add(double a, double b) {
        return a + b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double divide(double a, double b) throws Exception { if (b == 0)
            throw new Exception("Nelze dělit nulou");
        return a / b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double power(double a, double b){return Math.pow(a, b);
    }
    public long factorial(int value) throws Exception {if (value < 0)
        throw new Exception ("Pod nulou to nejde");
        if (value == 0)
            return 1;
        return value * factorial(value-1);
    }
}
