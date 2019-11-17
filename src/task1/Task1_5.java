package task1;

public class Task1_5 {
    public static void main(String[] args) {
        int number = 123456;
        System.out.println("Arithmetic mean of the number " + number + ": " + method5a(number));
        System.out.println("Geometric mean of the number " + number + ": " + method5b(number));
    }

    public static  double method5a(int n){
        if(isSixDigit(n)){
            int units=n%10, dozens=n%100/10, hundreds=n%1000/100,
                    thousands=n%10000/1000, tensOfThousands=n%100000/10000, hundredsOfThousands=n%1000000/100000;
            return (units+dozens+hundreds+thousands+tensOfThousands+hundredsOfThousands)/6.;
        } else return 0;
    }
    public static  double method5b(int n){
        if(isSixDigit(n)){
            int units=n%10, dozens=n%100/10, hundreds=n%1000/100,
                    thousands=n%10000/1000, tensOfThousands=n%100000/10000, hundredsOfThousands=n%1000000/100000;
            return Math.pow(units*dozens*hundreds*thousands*tensOfThousands*hundredsOfThousands, 1./6);
        } else return 0;
    }
    private static boolean isSixDigit(int n) {
        return (n >= 100000 && n < 1000000)?true:false;
    }
}
