package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Homework7 {

    public static void main(String[] args) {
        printIsLeapYar(1990);
        recommendVersion(0, 2021);
        calculateDeliveryDays(95);
        findDouble("abcf");
        int[] data = {3, 2, 1, 6, 5};
        reverseArray(data);
        System.out.println("reverseArray: " + Arrays.toString(data));
    }
    //Задача1
    public static void printIsLeapYar(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYarResult(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    private static void printIsLeapYarResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " Високосный год");
        } else {
            System.out.println(year + " Невисокосный год");
        }
    }
    //Задача2
    private static boolean isDeviseOld(int deviceYaer) {
        int currentYear = LocalDate.now().getYear();
        return deviceYaer < currentYear;
    }

    public static void recommendVersion(int clientOS, int deviceYaer) {
        boolean deviceIsOld = isDeviseOld(deviceYaer);
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("Установите ");
        if (deviceIsOld) {
            messageBuilder.append("облегченную ");
        }
        messageBuilder.append("версию для ");
        if (clientOS == 0) {
            messageBuilder.append("IOS");
        } else {
            messageBuilder.append("Android");
        }
        System.out.println(messageBuilder);
    }
    //Задача3
    public static void calculateDeliveryDays(int deliveryDistance) {
        int result = 1;
        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            result++;
        }
        System.out.println("Потребуется дней " + result);
    }
    //Задача4
    public static void findDouble(String text) {
        char[] letters = text.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == prevChar) {
                System.out.println("Найден дубль по символу " + letter);
                return;
            }
            prevChar = letter;
        }
        System.out.println("Дублей не найдено");
    }
    //Задача5
    public static void reverseArray(int[] arr) {
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            int temp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = temp;
        }
    }
}

