package ru.netology.statistics;

public class CalculationStatistics {
    //сумма всех продаж
    public int calculateSumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    //средняя сумма продаж в месяц
    public int calculateAvgSumSales(int[] sales) {
        return calculateSumSales(sales) / sales.length;
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    //находим последний месяц, соответсвующий условиям
    public int searchMonthMaxSales(int[] sales) {
        int max = sales[0];
        int month = 0;
        int index = 0;
        for (int sale : sales) {
            index++;
            if (sale >= max) {
                max = sale;
                month = index;
            }

        }
        return month;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    //находим последний месяц, соответсвующий условиям
    public int searchMonthMinSales(int[] sales) {
        int min = sales[0];
        int month = 0;
        int index = 0;
        for (int sale : sales) {
            index++;
            if (sale <= min) {
                min = sale;
                month = index;
            }

        }
        return month;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int calculateMonthSalesBelowAvg(int[] sales) {
        int count = 0;
        int avg = calculateAvgSumSales(sales);
        for (int sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int calculateMonthSalesHigherAvg(int[] sales) {
        int count = 0;
        int avg = calculateAvgSumSales(sales);
        for (int sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}
