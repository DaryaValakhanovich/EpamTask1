package task1;

public class Task1_7 {
    public static void main(String[] args) {
        method7(238,74);
    }

    public static void method7(int a, int b){
        printAandB(a, b);
        a +=b;
        b=a-b;
        a-=b;
        printAandB(a, b);
    }
    private static void printAandB(int a, int b) {
        System.out.println("a=" + a + ", b=" + b);
    }
}
