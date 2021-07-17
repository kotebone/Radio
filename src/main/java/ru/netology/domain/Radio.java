package ru.netology.domain;

public class Radio {
        String name;
        boolean on;
        int currentNumFm;
        int minNumFm = 0;
        int limitNumFm = 100;
        int currentLevVol;
        int minLevVol = 0;
        int maxLevVol = 100;
}