package ru.netology.domain;

public class RadioAdvanced {
        private String name;
        private boolean on;
        private int currentNumFm;
        private int minNumFm = 0;
        private int maxNumFm = 10;
        private int limitNumFm = 100;
        private int currentLevVol;
        private int minLevVol = 0;
        private int maxLevVol = 100;

        public RadioAdvanced(){
                this.limitNumFm = 100;
        }

        public RadioAdvanced(int limitNumFm) {
                this.limitNumFm = limitNumFm;
        }

        public int fmOneStepNext() {
                if (currentNumFm == limitNumFm-1) {
                        currentNumFm = minNumFm;
                        return minNumFm;
                }
                currentNumFm++;
                return currentNumFm;
        }

        public int fmOneStepPrev() {
                if (currentNumFm == minNumFm) {
                        currentNumFm = limitNumFm-1;
                        return limitNumFm-1;
                }
                currentNumFm--;
                return currentNumFm;
        }

        public void volOneStepInc() {
                if (currentLevVol >= maxLevVol) {
                        return;
                }
                currentLevVol++;
        }

        public void volOneStepRed() {
                if (currentLevVol <= minLevVol) {
                        return;
                }
                currentLevVol--;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getMaxNumFm() {
                return maxNumFm;
        }

        public void setMaxNumFm(int maxNumFm) {
                this.maxNumFm = maxNumFm;
        }

        public int getMinNumFm() {
                return minNumFm;
        }

        public void setMinNumFm(int minNumFm) {
                this.minNumFm = minNumFm;
        }

        public int getCurrentNumFm() {
                return currentNumFm;
        }

        public void setCurrentNumFm(int currentNumFm) {
                if (currentNumFm > maxNumFm) {
                        return;
                }
                if (currentNumFm < minNumFm) {
                        return;
                }
                this.currentNumFm = currentNumFm;
        }

        public int getMaxLevVol() {
                return maxLevVol;
        }

        public void setMaxLevVol(int maxLevVol) {
                this.maxLevVol = maxLevVol;
        }

        public int getMinLevVol() {
                return minLevVol;
        }

        public void setMinLevVol(int minLevVol) {
                this.minLevVol = minLevVol;

        }

        public int getCurrentLevVol() {
                return currentLevVol;
        }

        public void setCurrentLevVol(int currentLevVol) {
                if (currentLevVol > maxLevVol) {
                        return;
                }
                if (currentLevVol < minLevVol) {
                        return;
                }
                this.currentLevVol = currentLevVol;
        }
}