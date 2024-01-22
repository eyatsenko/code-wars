import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;
/*
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.
*/


public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours, minutes, sec;

        hours = seconds / 3600;
        minutes = (seconds - hours * 3600) / 60;
        sec = seconds - ((hours * 3600) + minutes * 60);

        return String.format("%02d:%02d:%02d", hours, minutes, sec);
    }
}