package Zadanie3.Task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    //найти позицию первого встретившегося локального минимума
    //(максимума), а если таких элементов нет, то возвратить -1 (локальный
    //минимум
    //– это элемент, который меньше любого из своих соседей; локальный
    //максимум – это элемент, который больше любого из своих соседей);
    public static void main(String[] args) {
        double[][] array = new double[][]{
                {1.2, 1.0, 7.8},
                {3.1, 0.9, 7.4},
                {0.2, 3.6, 7.8},
                {1.2, 8.6, 7.8}
        };
        int[] result = localMin(array);
        for (int x: result) {
            System.out.print(x+ " ");
        }
        System.out.println();
        result = localMax(array);
        for (int x: result) {
            System.out.print(x +" ");
        }
    }

    private static int[] localMin(double[][] array){
        int[] resultArray;
        int n=array.length-1,m =array[0].length-1;
        resultArray=localMinFirstLine(array);
        if(resultArray[0]!=-1){
            return resultArray;
        }
        for (int i = 1; i < n; i++) {
            if (array[i][0] < array[i-1][0] && array[i][0] < array[i][1] && array[i][0] < array[i+1][0]){
                resultArray[0]=i;
                resultArray[1]=0;
                return resultArray;
            }
            for (int j = 1; j < m; j++) {
                if (array[i][j] < array[i - 1][j]
                        && array[i][j] < array[i][j - 1] && array[i][j] < array[i][j + 1]
                        && array[i][j] < array[i + 1][j]) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                    return resultArray;
                }
            }
            if (array[i][m] < array[i-1][m] && array[i][m] < array[i][m] && array[i][m] < array[i+1][m]){
                resultArray[0]=i;
                resultArray[1]=m;
                return resultArray;
            }
        }
        resultArray=localMinLastLine(array);
        if(resultArray[0]!=-1){
            return resultArray;
        }
        return resultArray;
    }

    private static int[] localMinFirstLine(double[][] array) {
        int[] resultArray = new int[]{-1,-1};
        int n=array.length-1, m=array[0].length-1;
        if (array[0][0] < array[1][0] && array[0][0] < array[0][1]) {
            resultArray[0] = 0;
            resultArray[1] = 0;
            return resultArray;
        }
        for (int j = 1; j < m; j++) {
            if (array[0][j] < array[1][j - 1] && array[0][j] < array[1][j] && array[0][j] < array[1][j + 1]) {
                resultArray[0] = 0;
                resultArray[1] = j;
                return resultArray;
            }
        }
        if (array[0][m] < array[0][m - 1] && array[0][m] < array[1][m]) {
            resultArray[0] = 0;
            resultArray[1] = m;
            return resultArray;
        }
        return resultArray;
    }
    private static int[] localMinLastLine(double[][] array) {
        int[] resultArray = new int[]{-1,-1};
        int n=array.length-1, m=array[0].length-1;
        if (array[0][0] < array[1][0] && array[0][0] < array[0][1]) {
            resultArray[0] = 0;
            resultArray[1] = 0;
            return resultArray;
        }
        for (int j = 1; j < m; j++) {
            if (array[n][j] < array[n - 1][j - 1] && array[n][j] < array[n - 1][j] && array[n][j] < array[n - 1][j + 1]
                    && array[n][j] < array[n][j - 1] && array[n][j] < array[n][j + 1]) {
                resultArray[0] = n;
                resultArray[1] = j;
                return resultArray;
            }
        }
        if (array[0][m] < array[0][m - 1] && array[0][m] < array[1][m]) {
            resultArray[0] = 0;
            resultArray[1] = m;
            return resultArray;
        }
        return resultArray;
    }

    private static int[] localMax(double[][] array){
        int[] resultArray;
        int n=array.length-1,m =array[0].length-1;
        resultArray=localMaxFirstLine(array);
        if(resultArray[0]!=-1){
            return resultArray;
        }
        for (int i = 1; i < n; i++) {
            if (array[i][0] > array[i-1][0] && array[i][0] > array[i][1] && array[i][0] > array[i+1][0]){
                resultArray[0]=i;
                resultArray[1]=0;
                return resultArray;
            }
            for (int j = 1; j < m; j++) {
                if (array[i][j] > array[i - 1][j]
                        && array[i][j] > array[i][j - 1] && array[i][j] > array[i][j + 1]
                        && array[i][j] > array[i + 1][j]) {
                    resultArray[0] = i;
                    resultArray[1] = j;
                    return resultArray;
                }
            }
            if (array[i][m] > array[i-1][m] && array[i][m] > array[i][m] && array[i][m] > array[i+1][m]){
                resultArray[0]=i;
                resultArray[1]=m;
                return resultArray;
            }
        }
        resultArray=localMaxLastLine(array);
        if(resultArray[0]!=-1){
            return resultArray;
        }
        return resultArray;
    }

    private static int[] localMaxFirstLine(double[][] array) {
        int[] resultArray = new int[]{-1,-1};
        int n=array.length-1, m=array[0].length-1;
        if (array[0][0] > array[1][0] && array[0][0] > array[0][1]) {
            resultArray[0] = 0;
            resultArray[1] = 0;
            return resultArray;
        }
        for (int j = 1; j < m; j++) {
            if (array[0][j] > array[1][j - 1] && array[0][j] > array[1][j] && array[0][j] > array[1][j + 1]) {
                resultArray[0] = 0;
                resultArray[1] = j;
                return resultArray;
            }
        }
        if (array[0][m] > array[0][m - 1] && array[0][m] > array[1][m]) {
            resultArray[0] = 0;
            resultArray[1] = m;
            return resultArray;
        }
        return resultArray;
    }
    private static int[] localMaxLastLine(double[][] array) {
        int[] resultArray = new int[]{-1, -1};
        int n = array.length - 1, m = array[0].length - 1;
        if (array[0][0] < array[1][0] && array[0][0] < array[0][1]) {
            resultArray[0] = 0;
            resultArray[1] = 0;
            return resultArray;
        }
        for (int j = 1; j < m; j++) {
            if (array[n][j] > array[n - 1][j - 1] && array[n][j] > array[n - 1][j] && array[n][j] > array[n - 1][j + 1]
                    && array[n][j] > array[n][j - 1] && array[n][j] > array[n][j + 1]) {
                resultArray[0] = n;
                resultArray[1] = j;
                return resultArray;
            }
        }
        if (array[0][m] < array[0][m - 1] && array[0][m] < array[1][m]) {
            resultArray[0] = 0;
            resultArray[1] = m;
            return resultArray;
        }
        return resultArray;
    }
}
