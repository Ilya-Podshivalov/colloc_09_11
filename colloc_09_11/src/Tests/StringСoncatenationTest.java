package Tests;

import Fasad.StringСoncatenation;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringСoncatenationTest {

    @Test
    public void complete() {
        StringСoncatenation stringСoncatenation = new StringСoncatenation();
        String expectedString = "ABCDE";
        String actualString = stringСoncatenation.Complete("AB", "CD");
        actualString = stringСoncatenation.Complete(actualString, "E");
        assertEquals(expectedString, actualString);
    }
}