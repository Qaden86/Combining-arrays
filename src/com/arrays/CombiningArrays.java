package com.arrays;

import java.util.Arrays;

/**
 * Объединяем массивы
 * Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов firstArray и secondArray в один массив resultArray.
 * Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
 * <p>
 * <p>
 * Требования:
 * 1. В классе Solution должна быть публичная статическая переменная firstArray типа int[], проинициализированная массивом с 10-ю значениями.
 * 2. В классе Solution должна быть публичная статическая переменная secondArray типа int[], проинициализированная массивом с 10-ю значениями.
 * 3. В классе Solution должна быть публичная статическая переменная resultArray типа int[].
 * 4. Реализуй метод main(String[]) согласно условию.
 */

public class CombiningArrays {

    public static int[] firstArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public static int[] secondArray = new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    public static int[] resultArray;

    public static void main(String[] args) {
        resultArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);
        System.out.println(Arrays.toString(resultArray));
    }
}

/** JAVARUSH
 * public class Solution {
 * public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
 * public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
 * public static int[] resultArray;
 * <p>
 * public static void main(String[] args) {
 * resultArray = new int[firstArray.length + secondArray.length];
 * for (int i = 0; i < firstArray.length; i++) {
 * resultArray[i] = firstArray[i];
 * }
 * for (int i = 0; i < secondArray.length; i++) {
 * resultArray[i + firstArray.length] = secondArray[i];
 * }
 * <p>
 * for (int i = 0; i < resultArray.length; i++) {
 * System.out.print(resultArray[i] + ", ");
 * }
 * }
 * }
 **/