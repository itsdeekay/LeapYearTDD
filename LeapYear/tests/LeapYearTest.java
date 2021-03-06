package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import src.LeapYear;

public class LeapYearTest {
    private final LeapYear leapYear = new LeapYear();

    @Test
    void yearsDivisbleBy400() {
        assertEquals(true, leapYear.isLeapYear(2000));
    }

    @Test
    void yearsDivisbleBy100ButNot400() {
        assertEquals(false, leapYear.isLeapYear(2100));
    }

    @Test
    void yearsDivisbleBy4ButNot100() {
        assertEquals(true, leapYear.isLeapYear(2008));
    }

    @Test
    void yearsNotDivisbleBy4() {
        assertEquals(false, leapYear.isLeapYear(2009));
    }

    @Test
    void yearsDivisbleBy4000() {
        assertEquals(false, leapYear.isLeapYear(8000));
    }
}