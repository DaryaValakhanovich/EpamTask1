package task1;

public class Task1_6 {
    public static void main(String[] args) {
        int number = 1234567;
        System.out.println("Number " + number + " is reversed to " +  method6(number));
    }

    private static boolean isSevenDigit(int n) {
        return (n >= 1000000 && n < 10000000)?true:false;
    }

    public static int method6(int n){
        if(isSevenDigit(n)){
            int units=n%10, dozens=n%100/10, hundreds=n%1000/100, thousands=n%10000/1000,
                    tensOfThousands=n%100000/10000, hundredsOfThousands=n%1000000/100000, millions=n/1000000;
            return units*1000000+dozens*100000+hundreds*10000+thousands*1000
                    +tensOfThousands*100+hundredsOfThousands*10+millions;
        } else return 0;
    }
}
