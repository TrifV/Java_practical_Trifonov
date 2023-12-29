package ru.mirea.lab21;

public class Arr<T> {
    private T[] arr;

    public Arr(int size) {
        arr = (T[]) new Object[size];
    }

    public void setAll(T[] arr) {
        if (arr.length > arr.length) {
            System.err.println("Different size of array");
        } else {
            for (int i = 0; i < arr.length; i++) {
                set(i, arr[i]);
            }
        }
    }

    public void set(int index, T value) {
        arr[index] = value;
    }

    public T get(int index) {
        return arr[index];
    }
}