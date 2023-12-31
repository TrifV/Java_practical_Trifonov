package ru.mirea.lab20;


public class Test {
    public static void main(String[] args) {
        System.out.println("CLASS NAMES");
        Ex<Integer, String, Animal> test1 = new Ex<>(10, "fed", new Animal("Bob", "Cat"));
        test1.printClassNames();
        System.out.println();


        System.out.println("ARRAY OF INTEGERS");
        Integer[] array = {1, 4, 2, 345, 12, -32};
        MinMax<Integer> test2 = new MinMax<>(array);
        System.out.println("Max: " + test2.getMax() + "\nMin: " + test2.getMin());

        System.out.println("ARRAY OF DOUBLES");
        Double[] array2 = {1243.2, 4.432, 2.1, 345.535, 12.2, -32.042};
        MinMax<Double> test3 = new MinMax<>(array2);
        System.out.println("Max: " + test3.getMax() + "\nMin: " + test3.getMin());
        System.out.println();


        System.out.println("CALCULATOR OF NUMBERS OF DIFFERENT TYPES");
        System.out.println(Calculator.sum(2.3, 3));
        System.out.println(Calculator.subtract(5.23, 3.11));
        System.out.println(Calculator.multiply(0.1, 2434));
        System.out.println(Calculator.divide(10, 3.0));
        System.out.println();
    }
}
