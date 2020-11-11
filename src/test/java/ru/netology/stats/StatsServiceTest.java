package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateSumSales(sales);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateAverageSumSales(sales);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMonthMaxSales(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void findMonthMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findMonthMinSales(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void monthUnderAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthUnderAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void monthOverAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.monthOverAverage(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}