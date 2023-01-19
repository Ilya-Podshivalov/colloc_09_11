package Tests;

import Fasad.StringMultN;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMultNTest {

    @Test
    public void complete() {
        StringMultN stringMultN = new StringMultN();
        String expectedString = "TestTestTestTest";
        String actualString = stringMultN.Complete("Test", 4);
        assertEquals(expectedString, actualString);
    }
    @Test
    public void complete1(){
        StringMultN stringMultN = new StringMultN();
        String expectedString = "ABC";
        String actualString = stringMultN.Complete("ABC", 1);
        assertEquals(expectedString, actualString);
    }
}