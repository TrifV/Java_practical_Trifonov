package ru.mirea.lab3;

//Создайте массив из 4 случайных целых чисел из отрезка [10;99],
//        выведите его на экран в строку, далее определите и выведите на экран сообщение о том,
//        является ли массив строго возрастающей последовательностью.

import java.util.Random;

public class practVozrPosl {

        public static void main(String[] args) {
            int[] array = new int[4];

            // Заполняем массив случайными целыми числами в диапазоне [10; 99]
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(90) + 10; // Генерируем число от 10 до 99
            }

            // Выводим массив на экран
            System.out.print("Массив: ");
            for (int number : array) {
                System.out.print(number + " ");
            }

            // Проверяем, является ли массив строго возрастающей последовательностью
            boolean isIncreasing = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] <= array[i - 1]) {
                    isIncreasing = false;
                    break;
                }
            }

            if (isIncreasing) {
                System.out.println("\nМассив является строго возрастающей последовательностью.");
            } else {
                System.out.println("\nМассив не является строго возрастающей последовательностью.");
            }
        }
    }