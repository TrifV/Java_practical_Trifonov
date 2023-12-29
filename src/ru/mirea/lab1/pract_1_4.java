package ru.mirea.lab1;

import java.util.Scanner;
import java.math.BigInteger;
public class pract_1_4 {


    public static BigInteger Factorial(int f) {

        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= f; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args){
        int startNum = 100000;
        int endNum = 300000;

        for (int num = startNum; num <= endNum; num += 100000) {
            long startTime = System.currentTimeMillis();
            BigInteger result = Factorial (num);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            int schet = result.bitLength();

            System.out.println("Факториал числа" + num + ": " + result);
            System.out.println ("Время выполнения: " + executionTime /1000 + "sec");
            System.out.println(schet );
            System.out.println();
        }
}
}
