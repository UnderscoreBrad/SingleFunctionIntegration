import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(integrate(-1,1,1000000000));
        System.out.println(integrate_time(-1,1, 8000));
    }

    public static long integrate(double a, double b, int pointCount){
        long startTime = System.currentTimeMillis();
        double sum = 0;
        Random rand = new Random();
        for(int i = 0; i < pointCount; i++){
            double pointX = rand.nextDouble();
            double pointY = Math.sin(pointX) / pointX;
            sum += pointY;
        }
        double area = (sum / pointCount) * (b-a);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int integrate_time(double a, double b, long duration){
        long startTime = System.currentTimeMillis();
        double sum = 0;
        int pointCount = 0;
        Random rand = new Random();
        for(; System.currentTimeMillis() < startTime + duration; pointCount++){
            double pointX = rand.nextDouble();
            double pointY = Math.sin(pointX) / pointX;
            sum += pointY;
        }
        double area = (sum / pointCount) * (b-a);
        return pointCount;
    }
}