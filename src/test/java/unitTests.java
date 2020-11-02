import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class unitTests {
    @Test
    public void is2014ALeapYear(){

        boolean answer = leapYearCalculator.isALeapYear(2014);
        Assertions.assertFalse(answer);
    }
    @Test
    public void is2000ALeapYear(){

        boolean answer = leapYearCalculator.isALeapYear(2000);
        Assertions.assertTrue(answer);
    }
    @Test
    public void is1752ALeapYear(){

        boolean answer = leapYearCalculator.isALeapYear(1752);
        Assertions.assertTrue(answer);
    }
    @Test
    public void is1900ALeapYear(){

        boolean answer = leapYearCalculator.isALeapYear(1900);
        Assertions.assertFalse(answer);
    }
    @Test
    public void is2004ALeapYear(){

        boolean answer = leapYearCalculator.isALeapYear(2004);
        Assertions.assertTrue(answer);
    }
    @Test
    public void is2020ALeapYear(){

        boolean answer = leapYearCalculator.isALeapYear(2020);
        Assertions.assertTrue(answer);
    }

}
