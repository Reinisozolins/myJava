package FundamentalsBasic;

public class Arrays {
    public static void main(String[] args) {

        String[] pets = new String[3];

        pets[0] = "dog";
        pets[1] = "cat";
        pets[2] = "mouse";

        char[] vardi = new char[2];

        vardi[0] = 'a';
        vardi[1] = 'l';

        int[] cipari = new int[2];
        cipari[0] = 1;
        cipari[1] = 2;


        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);
        System.out.println(vardi[0]);
        System.out.println(vardi[1]);
        System.out.println(cipari[0]);
        System.out.println(cipari[1]);

        System.out.println(pets.length);
    }
}