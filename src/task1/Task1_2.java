package task1;

public class Task1_2 {
    public static void main(String[] args) {
        double kgWeight=23.5;
        System.out.println("Dinosaur weight in milligrams: " + method2a(kgWeight));
        System.out.println("Dinosaur weight in grams: " + method2b(kgWeight));
        System.out.println("Dinosaur weight in tons: " + method2c(kgWeight));
    }

    public static double method2a(double kgWeight){
        return kgWeight*1000000;
    }
    public static double method2b(double kgWeight){
        return kgWeight*1000;
    }
    public static double method2c(double kgWeight){
        return kgWeight/1000;
    }
}
