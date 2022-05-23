public class Time {

    public static double getCurrentTime() {

        double tenPowerNine = 1_000_000_000;

        return System.nanoTime() / tenPowerNine;
    }
}
