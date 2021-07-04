package ru.netology.domain;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RadioAdvancedTest {
    @Test
    public void shouldGetAndSet() {
        RadioAdvanced radio = new RadioAdvanced();
        String expected = "RadioRock";

        assertNull(radio.getName());
        radio.setName("RadioRock");
        assertEquals(expected, radio.getName());
    }

    @Test
    public void switchOnNextFm() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMinNumFm(0);
        radio.setMaxNumFm(9);
        radio.setCurrentNumFm(6);
        radio.setCurrentNumFm(7);

        int expected = 7;
        int actual = radio.getCurrentNumFm();
        assertEquals(expected, actual);
    }

    @Test
    public void switchOnPrevFm() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMinNumFm(0);
        radio.setMaxNumFm(9);
        radio.setCurrentNumFm(5);
        radio.setCurrentNumFm(4);

        int expected = 4;
        int actual = radio.getCurrentNumFm();
        assertEquals(expected, actual);
    }

    @Test
    public void returnMinFmAfterMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMinNumFm(0);
        radio.setMaxNumFm(9);
        radio.setCurrentNumFm(0);
        radio.setCurrentNumFm(10);

        int expected = 0;
        int actual = radio.getCurrentNumFm();
        assertEquals(expected, actual);
    }

    @Test
    public void returnMaxFmAfterMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMinNumFm(0);
        radio.setMaxNumFm(9);
        radio.setCurrentNumFm(9);
        radio.setCurrentNumFm(10);

        int expected = 9;
        int actual = radio.getCurrentNumFm();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentNumFm() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMinNumFm(0);
        radio.setMaxNumFm(9);
        radio.setCurrentNumFm(7);
        radio.setCurrentNumFm(6);

        int expected = 6;
        int actual = radio.getCurrentNumFm();
        assertEquals(expected, actual);
    }

    @Test
    public void incVolUpMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMinLevVol(0);
        radio.setMaxLevVol(10);
        radio.setCurrentLevVol(10);
        radio.setCurrentLevVol(11);

        int expected = 10;
        int actual = radio.getCurrentLevVol();
        assertEquals (expected, actual);

    }

    @Test
    public void redVolLowMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setMinLevVol(0);
        radio.setMaxLevVol(10);
        radio.setCurrentLevVol(0);
        radio.setCurrentLevVol(-1);

        int expected = 0;
        int actual = radio.getCurrentLevVol();
        assertEquals(expected, actual);

    }

    @Test
    public void setMinVol() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentLevVol(10);
        radio.setMinLevVol(0);

        int expected = 0;
        int actual = radio.getMinLevVol();
        assertEquals(expected, actual);
    }

    @Test
    public void setMaxVol() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentLevVol(11);
        radio.setMaxLevVol(10);

        int expected = 10;
        int actual = radio.getMaxLevVol();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldInitFieldToZeroValues() {
        RadioTest radio = new RadioTest();
        assertNull(radio.name);
        assertEquals(9, radio.maxNumFm);
        assertEquals(0, radio.minNumFm);
        assertEquals(0, radio.currentNumFm);
        assertEquals(0, radio.minLevVol);
        assertEquals(10, radio.maxLevVol);
        assertEquals(0, radio.currentLevVol);
    }
}