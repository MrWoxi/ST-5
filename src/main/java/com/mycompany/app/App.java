package com.mycompany.app;

public class App {
    public static void main(String[] args) {
        double[] values = {2.0, 4.0, 9.0, 16.0, 25.0, 100.0};
        for (double v : values) {
            Sqrt s = new Sqrt(v);
            System.out.printf("sqrt(%.1f) = %.10f%n", v, s.calc());
        }
    }
}
