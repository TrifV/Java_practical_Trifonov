package ru.mirea.lab1;

import java.util.Scanner;

public class pract_1_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        System.out.println("Введите числа массива: ");
        for (int i=0; i < size; i++){
            array[i] = scan.nextInt();
        }

        int sum_DW = 0;
        int iDW = 0;

        do{
            sum_DW += array[iDW];
            iDW++;
        }while(iDW < size);

        int sum_W = 0;
        int iW = 0;
        while (iW < size) {
            sum_W += array[iW];
            iW++;
        }

        // Поиск максимального и минимального элементов
        int max_element = array[0];
        int min_element = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max_element) {
                max_element = array[i];
            }
            if (array[i] < min_element) {
                min_element = array[i];
            }
        }

        System.out.println("Сумма элементов массива по циклу do while: " + sum_DW);
        System.out.println("Сумма элементов массива по циклу while: " + sum_W);
        System.out.println("Максимальный элемент массива: " + max_element);
        System.out.println("Минимальный элемент массива: " + min_element);

    }

    }