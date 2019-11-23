package Zadanie2.Task;

import java.util.Scanner;

public class Task3 {

    // Натуральное число называют совершенным, если оно равно сумме всех своих делителей,
    // не считая только его самого (например, 28=1+2+3+7+14 – совершенное число).
    // Напишите программу, которая проверяет, является ли введённое натуральное число совершенным.
    // Для проверки работоспособности программы приводится список некоторых совершенных чисел: 6, 28, 496, 8128.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input natural number: ");
        int n = sc.nextInt();
        System.out.println((n<0)?"Incorrect number":"Is number " + n
                + " perfect? - " + isPerfect(n));
        }

        private static boolean isPerfect(int n) {
            if (n == 1) {
                return false;
            }
            int result = 1;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    result += i;
                }
            }
            return result == n;
        }
}
