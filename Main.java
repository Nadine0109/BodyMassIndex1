public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();

        long bmi1 = service.calculate(76_000_000, 1750);
        System.out.println(bmi1);

        long bmi2 = service.calculate(98_000_000, 1980);
        System.out.println(bmi2);

        long bmi3 = service.calculate(50_000_000, 1820);
        System.out.println(bmi3);

        long bmi4 = service.calculate(65_000_000, 1420);
        System.out.println(bmi4);
    }

}


