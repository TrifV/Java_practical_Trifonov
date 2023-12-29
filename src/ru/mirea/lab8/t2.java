package ru.mirea.lab8;
import java.util.Scanner;
public class t2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
