package ru.mirea.lab1;

import java.util.Scanner;
public class pract_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Определение размера массива
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        int[] array = new int[size];
        // Ввод значений массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        // подсчёт суммы
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        // определение среднего арифметического
        double average = (double) sum / size;
        // Вывод результата
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}
