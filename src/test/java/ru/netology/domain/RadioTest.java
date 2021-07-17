package ru.netology.domain;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    public int maxNumFm;
    public int minNumFm = 0;
    private int limitNumFm = 100;
    public int currentNumFm;
    public int minLevVol = 0;
    public int maxLevVol = 100;
    public int currentLevVol;
    public Radio name;

    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    }

    @Test
    public void shouldInitFieldToZeroValues() {
        Radio radio = new Radio();
        assertNull(radio.name);
        assertEquals(0, radio.minNumFm);
        assertEquals(0, radio.currentNumFm);
        assertFalse(radio.on);
    }

    @Test
    @Disabled
    public void shouldThrowNPE() {
        Radio radio = new Radio();
        assertEquals(0, radio.name.length());
    }

    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentNumFm);
        radio.currentNumFm = 100;
        assertEquals(100, radio.currentNumFm);
    }
}