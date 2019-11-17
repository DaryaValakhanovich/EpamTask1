package task2;

public class Task2_2 {
    public static void main(String[] args) {
        int age = 128;
        System.out.println("Heads: " + howManyHeads(age));
        System.out.println("Eyes: " + howManyEyes(age));
    }

    public static int howManyHeads(int age) {
        if(age>=0) {
            int result = 3;
            if (age > 200) {
                result += (age < 300) ? 200 + age * 2 : 300 + age;
            } else result += age * 3;
            return result;
        }
        return 0;
    }
    public static int howManyEyes(int age) {
        return howManyHeads(age)*2;
    }
}
