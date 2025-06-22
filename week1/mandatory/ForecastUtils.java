public class ForecastUtils {

    public static double forecastValueIterative(double initialValue, double growthRate, int years) {
        double result = initialValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }
}
