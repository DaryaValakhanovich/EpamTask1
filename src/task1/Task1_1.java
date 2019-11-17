package task1;

public class Task1_1 {
    public static void main(String[] args) {
        System.out.println((method1a(2,2,3)?"a, b and c are the same":"a, b and c are not the same"));
        method1b(2,2,3);
    }

    public static boolean method1a(int a, int b, int c){
        return a==b && b==c;
    }

    public static void method1b(int a, int b, int c){
        if(a==b){
            System.out.println((b==c)?"a=b=c":"a=b");
        } else {
            System.out.println((b==c)?"b=c":"a, b and c are different");
        }
    }
}
