package Zadanie3.Task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    //транспонировать матрицу (при решении данного задания не
    //рекомендуется задействовать дополнительную память).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        System.out.println("Enter M:");
        int m = sc.nextInt();
        if(n > 0 && m > 0) {
            double[][] array = createArray(n, m);
            printArray(array);
            System.out.println();
            array = transposeRectangular(array);
            printArray(array);
        } else {
            System.out.println("Incorrect numbers.");
        }
        System.out.println("Enter N:");
        n = sc.nextInt();
        if(n > 0) {
            double[][] array = createArray(n, n);
            printArray(array);
            System.out.println();
            transpose(array);
            printArray(array);
        } else {
            System.out.println("Incorrect numbers.");
        }
    }

    private static void printArray(double[][] array) {
        for (double[] x : array) {
            for (double y : x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    private static double[][] createArray(int n, int m){
        final Random random = new Random();
        double[][] resultArray = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                resultArray[i][j]= new BigDecimal(random.nextDouble())
                        .setScale(2, RoundingMode.UP).doubleValue();
            }
        }
        return resultArray;
    }

    private static void transpose(double[][] array){
        int x = array.length;
        for (int i = 0; i < x; i++) {
            for (int j = i+1; j < x; j++) {
                double temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }

    private static double[][] transposeRectangular(double[][] array){
        int n=array.length,m =array[0].length;
        double[][] newArray = new double[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                newArray[j][i]=array[i][j];
            }
        }
        return newArray;
    }
}
