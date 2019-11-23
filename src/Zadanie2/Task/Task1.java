package Zadanie2.Task;

import java.util.Random;

public class Task1 {

    // Необходимо написать программу «Heads or Tails?» («Орёл или решка?»),
    // которая бы «подбрасывала» условно монету, к примеру, 1000 раз и сообщала,
    // сколько раз выпал орёл, а сколько – решка.

    public static void main(String[] args) {
        headsOrTails();
    }

    private static void headsOrTails(){
        final Random random = new Random();
        int eagles = 0;
        for(int i = 0; i < 1000; i++){
            eagles+=random.nextInt(2);
        }
        System.out.println("The eagle: " + eagles + " time(s). The tail: " + (1000-eagles) + " time(s).");
    }
}
