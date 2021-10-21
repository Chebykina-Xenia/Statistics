package ru.netology.statisticsTest;

import org.junit.jupiter.api.Test;
import ru.netology.statistics.CalculationStatistics;

import static org.junit.jupiter.api.Assertions.*;

class CalculationStatisticsTest {

    //тест для метода сумма всех продаж
    @Test
    void calculateSumSalesTest() {
        CalculationStatistics service = new CalculationStatistics();

        // данные
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        // вызываем целевой метод:
        int actual = service.calculateSumSales(sales);

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //тест для метода средняя сумма продаж в месяц
    @Test
    void calculateAvgSumSalesTest() {
        CalculationStatistics service = new CalculationStatistics();

        // данные
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        // вызываем целевой метод:
        int actual = service.calculateAvgSumSales(sales);

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    //находим последний месяц, соответсвующий условиям
    @Test
    void searchMonthMaxSalesTest() {
        CalculationStatistics service = new CalculationStatistics();

        // данные
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        // вызываем целевой метод:
        int actual = service.searchMonthMaxSales(sales);

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    //находим последний месяц, соответсвующий условиям
    @Test
    void searchMonthMinSalesTest() {
        CalculationStatistics service = new CalculationStatistics();

        // данные
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        // вызываем целевой метод:
        int actual = service.searchMonthMinSales(sales);

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    @Test
    void calculateMonthSalesBelowAvgTest() {
        CalculationStatistics service = new CalculationStatistics();

        // данные
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.calculateMonthSalesBelowAvg(sales);

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    @Test
    void calculateMonthSalesHigherAvgTest() {
        CalculationStatistics service = new CalculationStatistics();

        // данные
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.calculateMonthSalesHigherAvg(sales);

        //проверка ожидаемого и фактического результата
        assertEquals(expected, actual);
    }
}

