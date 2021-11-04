import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LeapYears_Test {
    @ParameterizedTest
    @MethodSource("LeapYears_test")

    public void this_input_is_divideble_by_4_but_not_100 (int year)
    {
       assertTrue(LeapYears.isLeapYear(year));
    }

    public static Stream LeapYears_test (){
            return Stream.of(
                    Arguments.of(2012),
                    Arguments.of(2000)
                    );


    }

    @ParameterizedTest
    @MethodSource("LeapYears")

    public void this_input_is_divideble_by_400(int year)

    {
       assertTrue(LeapYears.isLeapYear(year));
    }

    public static Stream LeapYears (){
            return Stream.of(
                    Arguments.of(2012),
                    Arguments.of(2000)
            );

    }

    @ParameterizedTest
    @MethodSource("not_leapYears")

    public void this_input_is_not_divideble_by_4(int year)
// this should be leapYear
    {
        assertFalse(LeapYears.isLeapYear(year));
    }

    public static Stream not_leapYears () {
        return Stream.of(
                Arguments.of(1700),
                Arguments.of(1800),
                Arguments.of(1900),
                Arguments.of(2100)
        );

    }

    @ParameterizedTest
    @MethodSource("not_leapYears_check")

    public void this_input_is_divideble_by_100_but_not_4 (int year)
    {
        assertFalse(LeapYears.isLeapYear(year));
    }

    public static Stream not_leapYears_check (){
        return Stream.of(
                Arguments.of(1700),
                Arguments.of(1800),
                Arguments.of(1900),
                Arguments.of(2100)
        );



    }

}
