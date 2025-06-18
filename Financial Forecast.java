import java.util.*;

public class FinancialForecast {
    public static double calculateAverage(double[] revenues) {
        double sum = 0;
        for (double revenue : revenues) {
            sum += revenue;
        }
        return sum / revenues.length;
    }

    public static void forecastNextMonth(double[] revenues) {
        double avg = calculateAverage(revenues);
        System.out.printf("Forecasted revenue for next month: ₹%.2f%n", avg);
    }

    public static void main(String[] args) {
        double[] monthlyRevenues = {120000, 135000, 128000, 140000, 130000, 150000}; // example data

        System.out.println("Past 6 months' revenue: " + Arrays.toString(monthlyRevenues));
        forecastNextMonth(monthlyRevenues);
    }
}
