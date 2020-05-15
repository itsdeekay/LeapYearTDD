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
}