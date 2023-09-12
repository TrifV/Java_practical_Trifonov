package ru.mirea.lab1;

public class pract_1_3 {
    public static void main(String[] args) {
        int n = 10;
        double sum = 0.0;

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.printf("H(%d) = %.5f%n", i, sum);
        }
    }
}