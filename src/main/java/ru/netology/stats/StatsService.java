package ru.netology.stats;

public class StatsService {

    public int getSalesAmount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int getAverageSalesAmount(int[] sales) {
        int avSales = getSalesAmount(sales) / 12;

        return avSales;
    }

    public int getMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getLessAverageSalesAmount(int[] sales) {
        int lessAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < getAverageSalesAmount(sales)) {
                lessAverage = lessAverage + 1;
            }
        }
        return lessAverage;
    }

    public int getMoreAverageSalesAmount(int[] sales) {
        int moreAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > getAverageSalesAmount(sales)) {
                moreAverage = moreAverage + 1;
            }
        }
        return moreAverage;
    }

}

