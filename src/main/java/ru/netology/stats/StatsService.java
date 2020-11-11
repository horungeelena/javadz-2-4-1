package ru.netology.stats;

public class StatsService {
    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return calculateSumSales(sales) / sales.length;
    }

    public int findMonthMaxSales(int[] sales) {
        int currentMax = sales[0];
        int month = 0;
        int monthMax = 0;
        for (int sale : sales) {
            month += 1;
            if (currentMax <= sale) {
                currentMax = sale;
                monthMax = month;
            }
        }
        return monthMax;
    }

    public int findMonthMinSales(int[] sales) {
        int currentMin = sales[0];
        int month = 0;
        int monthMin = 0;
        for (int sale : sales) {
            month += 1;
            if (currentMin >= sale) {
                currentMin = sale;
                monthMin = month;
            }
        }
        return monthMin;
    }

    public int monthUnderAverage(int[] sales) {
        int numberOfMonths = 0;
        for (int sale : sales) {
            if (sale < calculateAverageSumSales(sales)) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int monthOverAverage(int[] sales) {
        int numberOfMonths = 0;
        for (int sale : sales) {
            if (sale > calculateAverageSumSales(sales)) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}



