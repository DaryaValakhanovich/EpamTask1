package task2;

public class Task2_1 {
    public static void main(String[] args) {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 1, x3=1, y3=0;
        System.out.println((isRightTriangle(x1,y1,x2,y2,x3,y3))?"This is right triangle":"This is not right triangle");
    }

    public static boolean isRightTriangle(int x1, int y1, int x2, int y2 , int x3, int y3){
        if(isTriangle(x1,y1,x2,y2,x3,y3)){
            double squaredLength12 = distanceBetweenPoints(x1,y1,x2,y2),
                    squaredLength23 = distanceBetweenPoints(x2,y2,x3,y3),
                    squaredLength13 = distanceBetweenPoints(x1,y1,x3,y3);
            return squaredLength12+ squaredLength13 == squaredLength23
                    || squaredLength12 + squaredLength23== squaredLength13
                    || squaredLength23+squaredLength13 == squaredLength12;
        }
        return false;
    }
    public static boolean isTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y1-y2)*x3+(x2-x1)*y3+(x1*y2-x2*y1)!=0;
    }
    public static double distanceBetweenPoints(int x1, int y1, int x2, int y2){
        return Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
    }
}
