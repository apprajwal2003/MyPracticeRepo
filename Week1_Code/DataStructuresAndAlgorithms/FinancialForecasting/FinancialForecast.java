package DataStructuresAndAlgorithms.FinancialForecasting;

public class FinancialForecast {

    public static double[] forecast(int[] sales, int daysToPredict) {
        int n = sales.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += i;
            sumY += sales[i];
            sumXY += i * sales[i];
            sumX2 += i * i;
        }

        double m = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double c = (sumY - m * sumX) / n;

        double[] predictions = new double[daysToPredict];
        for (int i = 0; i < daysToPredict; i++) {
            predictions[i] = m * (n + i) + c;
        }

        return predictions;
    }

    public static void main(String[] args) {
        int[] sales = { 100, 120, 130, 90, 150, 160, 170, 200 };
        int daysToPredict = 5;

        double[] forecast = forecast(sales, daysToPredict);
        System.out.println("Linear Regression Forecast for next 5 days:");
        for (double f : forecast) {
            System.out.printf("%.2f ", f);
        }
    }
}
