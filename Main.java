public class Main {
    public static void main(String[] args) {
    BMIService service = new BMIService();

    long bMI1 = service.calculate (76_000_000, 1750);
    System.out.println(bMI1);

    long bMI2 = service.calculate (98_000_000, 1980);
    System.out.println(bMI2);

    long bMI3 = service.calculate (50_000_000, 1820);
    System.out.println(bMI3);

    long bMI4 = service.calculate (65_000_000, 1420);
    System.out.println(bMI4);
}

}


