package Zadanie2.Task;

public class Task2{
    // Разработать наиболее эффективные алгоритмы и написать код для решения следующих задач:
    // 1. найти наибольшую цифру натурального числа;
    // 2. проверить, является ли заданное натуральное число палиндромом;
    // 3. определить является ли заданное натуральное число простым;
    // 4. найти все простые делители заданного натурального числа;
    // 5. найти НОД и НОК двух натуральных чисел a и b.
    // 6. найти количество различных цифр у заданного натурального числа.

    public static void main(String[] args) {
        int numberForMethod1=45278263,
                numberForMethod2=12344321,
                numberForMethod3=8,
                numberForMethod4=4444,
                numberForMethod5a=12, numberForMethod5b=24,
                numberForMethod6=18188810;

        System.out.println((numberForMethod1<=0)?"Incorrect number":"Max numeral of number "
                + numberForMethod1 +": " + maxNumeral(numberForMethod1));

        System.out.println((numberForMethod2<=0)?"Incorrect number":"Is number " + numberForMethod2
                + " a palindrome? - " + isPalindrome(numberForMethod2));

        System.out.println((numberForMethod3<=0)?"Incorrect number":"Is number " + numberForMethod3
                + " prime? - " + isPrime(numberForMethod3));

        if(numberForMethod4>0)primeDivisors(numberForMethod4);

        System.out.println((numberForMethod5a<=0 || numberForMethod5b<=0)?"Incorrect number":"Nod and nok of numbers "
                + numberForMethod5a + " and " + numberForMethod5b +": "
                + nod(numberForMethod5a,numberForMethod5b) + " " + nok(numberForMethod5a,numberForMethod5b));

        System.out.println((numberForMethod6<=0)?"Incorrect number":"Amount of different numerals of number "
                + numberForMethod6 +": " +  differentNumerals(numberForMethod6));
    }

    private static int maxNumeral(int i) {
        int max=i%10;
        for(i/=10;i>0;i/=10){
            if(max<i%10){
                max=i%10;
            }
        }
        return max;
    }
    private static boolean isPrime(int i) {
        if(i==1 ||(i!=2 && i%2==0)){
            return false;
        }
        for(int j=3; j<=i/2; j+=2){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int i) {
        int x = 1, a = i, b = i;
        while(a>9){
            a /=10;
            x++;
        }
        for(int j=1; j<=x/2; j++){
            if(a!=b%10){
                return false;
            }
            a= i/(int)Math.pow(10, x-1-j)%10;
            b/=10;
        }
        return true;
    }

    private static void primeDivisors(int i) {
        System.out.print("Prime divisors of number " + i + ": ");
        int j = 2;
        while(i%j==0) {
            System.out.print(j + " ");
            i/=j;
        }
        j=3;
        while(i>1){
            if(i%j==0){
                System.out.print(j + " ");
                i/=j;
            } else {
                j+=2;
            }
        }
        System.out.println();
    }

    private static int nod(int a, int b) {
        int result = 1, min= Math.min(a, b);
        for(int i=2; i <= min; i++){
            if(a%i==0  && b%i==0){
                result=i;
            }
        }
        return result;
    }

    private static int nok(int a, int b) {
        int result = a*b, max= Math.max(a, b);
        int j = 2;
        while(a%j==0 && b%j==0) {
            result /= j;
            a /= j;
            b /= j;
        }
        j=3;
        while(j < a || j < b) {
            if(a%j==0 && b%j==0){
                result /= j;
                a /= j;
                b /= j;
            } else {
                j+=2;
            }
        }
        return result;
    }

    private static int differentNumerals(int i) {
        int j=0, differentI,  x;
        do {
            j++;
            x = i % 10;
            i/=10;
            differentI = 0;
            while (i > 0) {
                if (x != i % 10) {
                    differentI = differentI * 10 + i % 10;
                }
                i /= 10;
            }
            i=differentI;
        } while (differentI>0);
        return j;
    }

}
