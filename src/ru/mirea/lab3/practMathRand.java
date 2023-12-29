package ru.mirea.lab3;

//Создать массив вещественных чисел случайным образом, вывести его
//        на экран, отсортировать его, и снова вывести на экран (использовать
//        два подхода к генерации случайных чисел – метод random() класса Math
//        и класс Random)

import java.util.Arrays;
import java.util.Random;

public class practMathRand {

    public static void main(String[] args) {
        int arrayLength = 10; // Задайте длину массива по вашему усмотрению

        // Создание массива
        double[] array1 = new double[arrayLength];
        double[] array2 = new double[arrayLength];

        // Заполнение массива случайными числами с использованием метода random() класса Math
        for (int i = 0; i < arrayLength; i++) {
            array1[i] = Math.random();
        }

        // Заполнение массива случайными числами с использованием класса Random
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array2[i] = random.nextDouble();
        }

        // Вывод исходных массивов
        System.out.println("Исходный массив (метод random() класса Math): " + Arrays.toString(array1));
        System.out.println("Исходный массив (класс Random): " + Arrays.toString(array2));

        // Сортировка массивов
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Вывод отсортированных массивов
        System.out.println("Отсортированный массив (метод random() класса Math): " + Arrays.toString(array1));
        System.out.println("Отсортированный массив (класс Random): " + Arrays.toString(array2));
    }
}
