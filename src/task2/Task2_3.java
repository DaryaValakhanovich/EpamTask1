package task2;

public class Task2_3 {
    public static final char[] VOWELS = {'A','E' ,'I' ,'O' ,'U' ,'Y','a' ,'e' ,'i' ,'o','u' ,'y'};

    public static void main(String[] args) {
        char a='b';
        System.out.println(isVowel1(a));
        System.out.println(isVowel2(a));
        System.out.println(isVowel3(a));
    }

    public static boolean isLetter(char x){
        return (x >= 'A' && x <= 'Z') || (x >= 'a' && x <= 'z');
    }
    public static boolean isVowel1(char x){
        if(isLetter(x)){
            return x=='A' || x=='E' || x=='I' || x=='O' || x=='U' || x=='Y'
                    || x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='y';
        }
        return false;
    }
    public static boolean isVowel2(char x){
        if(isLetter(x)){
            for(char vowel : VOWELS) {
                if (x == vowel) return true;
            }
        }
        return false;
    }
    public static boolean isVowel3(char x){
        if(isLetter(x)){
            switch (x){
                case ('A'):
                case ('E'):
                case ('I'):
                case ('O'):
                case ('U'):
                case ('Y'):
                case ('a'):
                case ('e'):
                case ('i'):
                case ('o'):
                case ('u'):
                case ('y'):
                    return true;
            }
        }
        return false;
    }
}
