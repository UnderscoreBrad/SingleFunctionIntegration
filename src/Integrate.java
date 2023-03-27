import java.util.Random;

public class Integrate {
    public static void main(String[] args) {
        if(args.length < 4){
            System.out.println("Improper usage. Incorrect terminal args.");
            System.out.println("USAGE: java Integrate --count a b point_count");
            System.out.println("USAGE: java Integrate --timed a b duration_millis");
            System.out.println("USAGE: java Integrate --both a b point_count duration_millis");
        }
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        if(args[0].equalsIgnoreCase("--count")){
            long pointCount = Long.parseLong(args[3]);
            System.out.println(integrate(a, b, pointCount));
            return;
        }
        if(args[0].equalsIgnoreCase("--timed")){
            long duration = Long.parseLong(args[3]);
            System.out.println(integrate_time(a, b, duration));
            return;
        }
        if(args.length >= 5 && args[0].equalsIgnoreCase("--both")){
            long pointCount = Long.parseLong(args[3]);
            long duration = Long.parseLong(args[4]);
            System.out.println(integrate(a, b, pointCount));
            System.out.println(integrate_time(a, b, duration));
        }
    }

    public static long integrate(double a, double b, long pointCount){
        long startTime = System.currentTimeMillis();
        double sum = 0;
        Random rand = new Random();
        for(long i = 0; i < pointCount; i++){
            double pointX = rand.nextDouble();
            double pointY = Math.sin(pointX) / pointX;
            sum += pointY;
        }
        double area = (sum / pointCount) * (b-a);
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long integrate_time(double a, double b, long duration){
        long startTime = System.currentTimeMillis();
        double sum = 0;
        long pointCount = 0;
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