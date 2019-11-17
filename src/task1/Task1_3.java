package task1;

public class Task1_3 {
    public static void main(String[] args) {
        double r1 = 23.5, r2 =10.;
        System.out.println("Ring area with radii " + r1 + " and " + r2 + ": " + method3(r1,r2));
    }

    public static double method3(double r1, double r2){
        return (r1>r2)?Math.PI*(r1*r1-r2*r2):0;
    }
}
