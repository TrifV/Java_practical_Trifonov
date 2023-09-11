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

        }

    }

