package FILOmethod;

import java.util.Stack;



// FILO- First In Last Out

public class ClassForShooting {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        Gun makarov = new Gun("Glock", stack);
        Stack<Integer> magazine = makarov.getMagazine();
        makarov.fillMagazine(magazine, 1);
        makarov.fillMagazine(magazine, 2);
        makarov.fillMagazine(magazine, 3);
        makarov.fillMagazine(magazine, 4);
        makarov.fillMagazine(magazine, 5);
        makarov.fillMagazine(magazine, 6);
        makarov.fillMagazine(magazine, 7);
        makarov.fillMagazine(magazine, 8);

        makarov.fillMagazine(magazine, 9);

        makarov.shoot(magazine);
        makarov.shoot(magazine);
        makarov.shoot(magazine);
        makarov.shoot(magazine);
        makarov.shoot(magazine);
        makarov.shoot(magazine);
        makarov.shoot(magazine);
        makarov.shoot(magazine);
        makarov.shoot(magazine);

    }
}

