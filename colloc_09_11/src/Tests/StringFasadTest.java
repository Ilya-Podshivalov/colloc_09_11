package Tests;

import Fasad.StringFasad;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringFasadTest {

    @Test
    public void FasadComplete() {
        StringFasad fasad = new StringFasad();
        String expectedString = "BumBumBumBumBumBum";
        String actualString = fasad.FasadComplete("Bum", 3);
        actualString = fasad.FasadComplete(actualString, 2);
        assertEquals(actualString, expectedString);
    }

    @Test
    public void FasadComplete1() {
        StringFasad fasad = new StringFasad();
        String expectedString = "BumBumBum";
        String actualString = fasad.FasadComplete("Bum", "BumBum");
        assertEquals(actualString, expectedString);
    }
}