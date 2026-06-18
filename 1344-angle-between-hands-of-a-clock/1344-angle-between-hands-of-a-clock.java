class Solution {
    public double angleClock(int hour, int minutes) {
        double cal = Math.abs(((30 * hour) - (5.5 * minutes)));
        double ang = Math.min(cal, 360 - cal);
    return ang;
    }
}