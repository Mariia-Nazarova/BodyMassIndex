public class BmiService {
    public double canculate(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);

        return bmi;
    }
}
