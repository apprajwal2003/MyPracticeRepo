package DataStructuresAndAlgorithms;

public class FinancialForecasting {

    // Linear Regression Function
    public static double predictNextMonthRevenue(int[] months, double[] revenue, int nextMonth) {
        int n = months.length;

        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += months[i];
            sumY += revenue[i];
            sumXY += months[i] * revenue[i];
            sumX2 += months[i] * months[i];
        }

        // Calculate slope (b) and intercept (a)
        double b = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double a = (sumY - b * sumX) / n;

        // Predict revenue for the next month
        return a + b * nextMonth;
    }

    public static void main(String[] args) {
        // Example: revenue over 6 months (in lakhs)
        int[] months = { 1, 2, 3, 4, 5, 6 };
        double[] revenue = { 10.0, 11.5, 12.0, 13.5, 14.0, 15.5 };

        int nextMonth = 7;
        double predictedRevenue = predictNextMonthRevenue(months, revenue, nextMonth);

        System.out.printf("Predicted revenue for month %d is Rs. %.2f lakhs%n", nextMonth, predictedRevenue);
    }
}
