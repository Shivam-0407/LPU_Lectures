package Character_Class;

public class Main {
    public static void main(String[] args) {
//        char c= 'a';
//        String s = "a";
//        int x = s.charAt(0);
//        char y = (char)x;
//        System.out.println(y);
//
//        System.out.println(Character.isLetter((char)((int)(s.charAt(0)))));

        char c=' ';

        System.out.println(Character.isWhitespace(c));


    }

    private static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = a;
    }
}
