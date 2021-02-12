public class BMIService {
    public long calculate (long weight, long height) {
        long bMI = weight / (height*height);
        return bMI;
    }
}

