package Zadanie2.Task;

import java.util.Scanner;

public class Task4 {

    // 4) Дру́жественные чи́сла — два различных натуральных числа,
    // для которых сумма всех собственных делителей первого числа равна второму числу и наоборот,
    // сумма всех собственных делителей второго числа равна первому числу.
    // Дружественные числа были открыты последователями Пифагора, которые, однако,
    // знали только одну пару дружественных чисел – 220 и 284.
    // Найдите все дружественные числа в заданном диапазоне.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input diapason. From: ");
        int from = sc.nextInt();
        System.out.print("To: ");
        int to = sc.nextInt();
        if(from>=to || from <= 0){
            System.out.println("Incorrect numbers.");
        } else {
            amicableNumbersFromDiapason(from,to);
        }
    }

    private static boolean areAmicable(int a, int b){
        return sumOfDividers(a)==b && sumOfDividers(b)==a;
    }

    private static int sumOfDividers(int n){
        if (n == 1) {
            return 0;
        }
        int result = 1;
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                result+=i;
            }
        }
        return result;
    }

    private static void amicableNumbersFromDiapason(int from, int to){
        for(int i = from; i <= to; i++){
            for(int j = i + 1; j <= to; j++){
                if (areAmicable(i,j)){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
}
