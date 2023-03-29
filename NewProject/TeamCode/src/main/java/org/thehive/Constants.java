package org.thehive;

public class Constants {
    public enum ColorPreset {
        PURE_ORANGE(184, 118, 77),
        PURE_GREEN(52, 94, 65),
        PURE_PURPLE(95, 60, 99),
        PURE_GRAY(128, 123, 125);

        public int r, g, b;

        ColorPreset(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }
    }

    public static enum SamplingLocation {
        LEFT, CENTER, RIGHT
    }
}