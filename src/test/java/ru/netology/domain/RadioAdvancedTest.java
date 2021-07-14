package ru.netology.domain;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioAdvancedTest {
    @Test
    public void shouldGetAndSet() {
        RadioAdvanced radio = new RadioAdvanced(10);
        String expected = "RadioHardRock";

        Assertions.assertNull(radio.getName());
        radio.setName("RadioHardRock");
        assertEquals(expected, radio.getName());
    }

    @Test
    public void switchOnNextFm() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setCurrentNumFm(4);
        radio.fmOneStepNext();
        int actual = radio.getCurrentNumFm();
        assertEquals(5, actual);
    }

    @Test
    public void switchOnPrevFm() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setCurrentNumFm(8);
        radio.fmOneStepPrev();
        int actual = radio.getCurrentNumFm();
        assertEquals(7, actual);
    }

    @Test
    public void returnMinFmAfterMax() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setMinNumFm(0);
        radio.setMaxNumFm(10);
        radio.setCurrentNumFm(0);

        radio.setCurrentNumFm(-1);

        int expected = 0;
        int actual = radio.getCurrentNumFm();
        assertEquals(expected, actual);
    }

    @Test
    public void returnMaxFmAfterMin() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setMinNumFm(0);
        radio.setMaxNumFm(10);
        radio.setCurrentNumFm(10);

        radio.setCurrentNumFm(11);

        int expected = 10;
        int actual = radio.getCurrentNumFm();
        assertEquals(expected, actual);
    }

    @Test
    public void setCurrentNumFm() {
        RadioAdvanced radio = new RadioAdvanced(10);
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
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setMaxLevVol(100);
        radio.setMinLevVol(0);
        radio.setCurrentLevVol(100);

        radio.setCurrentLevVol(101);

        int expected = 100;
        int actual = radio.getCurrentLevVol();
        assertEquals (expected, actual);

    }

    @Test
    public void redVolLowMin() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setMaxLevVol(100);
        radio.setMinLevVol(0);
        radio.setCurrentLevVol(0);

        radio.setCurrentLevVol(-1);

        int expected = 0;
        int actual = radio.getCurrentLevVol();
        assertEquals(expected, actual);

    }

    @Test
    public void setMinVol() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setCurrentLevVol(10);
        radio.setMinLevVol(0);

        radio.setMinLevVol(0);

        int expected = 0;
        int actual = radio.getMinLevVol();
        assertEquals(expected, actual);
    }

    @Test
    public void setMaxVol() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setCurrentLevVol(11);
        radio.setMaxLevVol(100);

        radio.setMaxLevVol(100);

        int expected = 100;
        int actual = radio.getMaxLevVol();
        assertEquals(expected, actual);
    }

    @Test
    void volOneStepInc() {
        RadioAdvanced radio = new RadioAdvanced(10);

        radio.setCurrentLevVol(15);
        radio.volOneStepInc();

        assertEquals(16, radio.getCurrentLevVol());
    }

    @Test
    void volOneStepRed() {
        RadioAdvanced radio = new RadioAdvanced(10);

        radio.setCurrentLevVol(25);
        radio.volOneStepRed();

        assertEquals(24, radio.getCurrentLevVol());
    }

    @Test
    public void shouldInitFieldToZeroValues() {
        RadioTest radio = new RadioTest();
        Assertions.assertNull(radio.name);
        assertEquals(0, radio.minNumFm);
        assertEquals(0, radio.currentNumFm);
        assertEquals(0, radio.minLevVol);
        assertEquals(100, radio.maxLevVol);
        assertEquals(0, radio.currentLevVol);
    }
}