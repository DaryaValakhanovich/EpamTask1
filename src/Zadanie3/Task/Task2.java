package Zadanie3.Task;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    //найти среднеарифметическое и среднегеометрическое значения всех
    //элементов матрицы;

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
            double[] result = arithmAndGeomMean(array);
            printResultArray(result);
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

    private static void printResultArray(double[] array) {
        System.out.println("Arithmetic and Geometric means: ");
        for (double y : array) {
            System.out.print(y + " ");
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

    private static double[] arithmAndGeomMean(double[][] array){
        double[] resultArray = new double[]{0, 1};
        int length = 0;
        for (double[] x:array) {
            length += x.length;
            for (double y:x) {
                resultArray[0]+=y;
                resultArray[1]*=y;
            }
        }
        resultArray[0]/=length;
        resultArray[1]=Math.pow(resultArray[1],1./length);
        return resultArray;
    }
}
