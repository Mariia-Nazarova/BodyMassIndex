public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 52.3;
        double height = 1.66;
        double bmi = service.canculate(weight, height);
        System.out.println(bmi);

    }
}
