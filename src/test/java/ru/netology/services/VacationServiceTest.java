package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class VacationServiceTest {
    @Test
    public void testVacationCountLess () {
        VacationService service = new VacationService();

        int expected = 3;
        int actual = service.calcVacation(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVacationCountMore () {
        VacationService service = new VacationService();

        int expected = 2;
        int actual = service.calcVacation(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }

    // @ParameterizedTest
    // @CsvFileSource(files="src/test/resources/vacation.csv")
    // public void testVacationCount(int expected, int income, int expenses, int threshold) {
    // VacationService service = new VacationService();
    // int actual = service.calcVacation(income, expenses, threshold);

    // Assertions.assertEquals(expected, actual);
    }
