package task1;

public class Task1_4 {
    public static void main(String[] args) {
        method4(3210);
    }

    public static void method4(int n){
        if(n>=1000 && n<10000){
            int units=n%10, dozens=n%100/10, hundreds=n%1000/100, thousands=n/1000;
            if(thousands < hundreds && hundreds < dozens && dozens< units){
                System.out.println("The digits of the four-digit number " + n + " form an increasing sequence.");
            } else if(thousands > hundreds && hundreds > dozens && dozens > units){
                System.out.println("The digits of the four-digit number " + n + " form a decreasing sequence.");
            } else {
                System.out.println("The digits of the four-digit number " + n + " don't form any sequence.");
            }
        } else {
            System.out.println("The number is not four-digit.");
        }
    }
}
