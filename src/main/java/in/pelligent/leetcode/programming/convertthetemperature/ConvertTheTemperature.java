package in.pelligent.leetcode.programming.convertthetemperature;

public class ConvertTheTemperature {
    public double[] solution1(double celsius) {
        return new double[]{
                celsius+273.15,
                celsius*1.80+32.00
        };
    }
}
