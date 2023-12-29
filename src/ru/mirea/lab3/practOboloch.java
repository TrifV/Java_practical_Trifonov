package ru.mirea.lab3;

//Задания на классы Оболочки
//      Задание 1
//        1. Создайте объекты класса Double, используя методы valueOf().
//        2. Преобразовать значение типа String к типу double. Используем
//        метод Double.parseDouble().
//        3. Преобразовать объект класса Double ко всем примитивным типам.
//        4. Вывести значение объекта Double на консоль.
//        5. Преобразовать литерал типа double к строке: String d =
//        Double.toString(3.14);


public class practOboloch {
    public static void main(String[] args) {
        // Создание объектов класса Double с использованием метода valueOf()
        Double doubleObject1 = Double.valueOf(3.14);
        Double doubleObject2 = Double.valueOf("2.71");

        // Преобразование значения типа String к типу double с использованием метода Double.parseDouble()
        String strValue = "1.23";
        double parsedDouble = Double.parseDouble(strValue);

        // Преобразование объекта Double ко всем примитивным типам
        double doubleToPrimitive = doubleObject1.doubleValue();
        float floatToPrimitive = doubleObject1.floatValue();
        long longToPrimitive = doubleObject1.longValue();
        int intToPrimitive = doubleObject1.intValue();
        short shortToPrimitive = doubleObject1.shortValue();
        byte byteToPrimitive = doubleObject1.byteValue();

        // Вывод значения объекта Double на консоль
        System.out.println("doubleObject1: " + doubleObject1);
        System.out.println("doubleObject2: " + doubleObject2);

        // Преобразование литерала типа double к строке
        String d = Double.toString(3.14);

        System.out.println("Преобразованный литерал double в строку: " + d);
    }
}