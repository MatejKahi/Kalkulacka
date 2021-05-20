import java.util.Scanner;

public class KalkulackaCLI {
    private Scanner sc = new Scanner(System.in);
    private Kalkulacka calculator = new Kalkulacka();

    public void oddelovac() {
        System.out.println("--------------------------------");
    }

    public String prvniCislo() {

        System.out.println("Type the first number:");
        String aString = sc.nextLine();
        return aString;
    }

    public String druhyCislo() {
        System.out.println("Type the second number:");
        String bString = sc.nextLine();
        return bString;
    }

    public void napis() {
        System.out.println("   _____        _               _         _               \n" +
                "  / ____|      | |             | |       | |              \n" +
                " | |      __ _ | |  ___  _   _ | |  __ _ | |_  ___   _ __ \n" +
                " | |     / _` || | / __|| | | || | / _` || __|/ _ \\ |  __|\n" +
                " | |____| (_| || || (__ | |_| || || (_| || |_| (_) || |   \n" +
                "  \\_____|\\__,_||_| \\___| \\__,_||_| \\__,_| \\__|\\___/ |_|   \n" +
                "                                                         ");
    }

    public void text() throws Exception {
        System.out.println("What operation would you like to do?");
        oddelovac();
        System.out.println("A) Add");
        System.out.println("B) Subtract");
        System.out.println("C) Divide");
        System.out.println("D) Multiply");
        System.out.println("E) To the power of");
        System.out.println("F) Factorial");
        oddelovac();
        String vysledek = "";

        String option = sc.nextLine();
        if (option.equals("A")) {
            oddelovac();
            System.out.println("You chose to add");
            oddelovac();
            String aString = prvniCislo();
            String bString = druhyCislo();
            oddelovac();
            double a = Double.parseDouble(aString);
            double b = Double.parseDouble(bString);

            double added = calculator.add(a, b);
            vysledek = Double.toString(added);
        }
        if (option.equals("B")) {
            oddelovac();
            System.out.println("You chose to Subtract.");
            oddelovac();
            String aString = prvniCislo();
            String bString = druhyCislo();
            oddelovac();

            double a = Double.parseDouble(aString);
            double b = Double.parseDouble(bString);

            double subtracted = calculator.minus(a, b);
            vysledek = Double.toString(subtracted);

        }
        if (option.equals("C")) {
            oddelovac();
            System.out.println("You chose to Divide.");
            oddelovac();
            String aString = prvniCislo();
            String bString = druhyCislo();
            oddelovac();

            double a = Double.parseDouble(aString);
            double b = Double.parseDouble(bString);

            double divided = calculator.divide(a, b);
           vysledek = Double.toString(divided);
        }
        if (option.equals("D")) {
            oddelovac();
            System.out.println("You chose to Multiply.");
            oddelovac();
            String aString = prvniCislo();
            String bString = druhyCislo();
            oddelovac();

            double a = Double.parseDouble(aString);
            double b = Double.parseDouble(bString);

            double multiplied = calculator.multiply(a, b);
            vysledek = Double.toString(multiplied);

        }

        if (option.equals("E")) {
            oddelovac();
            System.out.println("You chose to Power.");
            oddelovac();
            String aString = prvniCislo();
            String bString = druhyCislo();
            oddelovac();

            double a = Double.parseDouble(aString);
            double b = Double.parseDouble(bString);

            double power = calculator.power(a, b);
            vysledek = Double.toString(power);
        }
        if (option.equals("F")) {
            oddelovac();
            System.out.println("You chose to factorial.");
            oddelovac();
            System.out.println("Type the number:");
            String aString = sc.nextLine();
            oddelovac();

            int a = Integer.parseInt(aString);

            long factorial = calculator.factorial(a);
            vysledek = Long.toString(factorial);
        }
        System.out.println("The result is:");
        System.out.println(vysledek);
    }
}
