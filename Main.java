/*1. Linear Search
        Given an array arr[] of N elements, the challenge is to write a function to find a given element x in arr[] .


        Линейный поиск используется для поиска ключевого элемента среди нескольких элементов.
        Линейный поиск сегодня используется меньше, потому что он медленнее, чем бинарный поиск и хеширование.


        Алгоритм:
        
        Шаг 1: Обход массива
        Шаг 2: Сопоставьте ключевой элемент с элементом массива
        Шаг 3: Если ключевой элемент найден, верните позицию индекса элемента массива.
        Шаг 4: Если ключевой элемент не найден, верните -1*/

/*2. Find the element that appears once in a sorted array
        Given a sorted array in which all elements occur twice (one after the other) and one element appears only once.

        Простое решение состоит в обходе массива слева направо. Поскольку массив отсортирован, мы легко можем
        найти нужный элемент.

        Алгоритм:
        Шаг 1: Обход массива через один элемент
        Шаг 2: Если элемент отличается от первого то мы нашли не задублированный элемент
        Шаг 3: Вернем элемент или позицию в массиве
        Шаг 4: Если ключевой элемент не найден, верните -1 или что то еще :)
        …
        Шаг 5: Исправить ошибку ArrayIndexOutOfBoundsException*/

import java.sql.SQLOutput;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("exercise 1");

        int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
        int needNum = 7;

        int res1 = FindElement(arr1, needNum);
        System.out.println("Looking for first array " + res1);

        int res2 = FindElement(arr2, needNum);
        System.out.println("Looking for second array " + res2);

        System.out.println("exercise 2");

        int[] oddArr1 = new int[] { 1, 1, 2, 2, 3, 3, 4, 5, 5 };
        int[] oddArr2 = new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
        int[] oddArr3 = new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5 };

        int res3 = FindNotOddElement(oddArr1);
        System.out.println("Looking for third array " + res3);

        int res4 = FindNotOddElement(oddArr2);
        System.out.println("Looking for fourth array " + res4);

        int res5 = FindNotOddElement(oddArr3);
        System.out.println("Looking for fifth array " + res5);
    }
    
    public static int FindElement(int[] arr, int needNum)
    {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == needNum)
            {
                return  i;
            }
        }

        return -1;
    }

    public static int FindNotOddElement(int[] oddArr)
    {
        for (int i = 0; i < oddArr.length; i = i + 2) {
            if(i + 1 >= oddArr.length) return -1; // Проверяем есть ли с чем сравнить последний элемент массива

            if(oddArr[i] != oddArr[i + 1])
            {
                return i;
            }
        }

        return -1;
    }
}