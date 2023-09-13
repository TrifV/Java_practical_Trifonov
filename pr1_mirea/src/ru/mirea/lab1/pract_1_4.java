package ru.mirea.lab1;

import java.util.Scanner;
public class pract_1_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите число, чтобы узнать его факториал: ");
        int s = scan.nextInt();
        System.out.println(Factorial(s));
    }

    public static int Factorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
