public class BMIService {
    public long calculate(long weight, long height) {
        long bmi = weight / (height * height);
        return bmi;
    }
}

