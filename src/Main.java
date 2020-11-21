public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();

        float bmi = service.calculate(75,1.75F);
        System.out.println(bmi);

        float bmi1 = service.calculate(85,1.70F);
        System.out.println(bmi1);

        float bmi2 = service.calculate(55,1.85F);
        System.out.println(bmi2);

        float bmi3 = service.calculate(62,1.91F);
        System.out.println(bmi3);
    }
}
