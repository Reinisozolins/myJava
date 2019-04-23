package FILOmethod;

import java.util.Stack;


public class Gun {
    private String name;
    private Stack<Integer> magazine;

    public Gun(String name, Stack<Integer> magazine) {
        this.name = name;
        this.magazine = magazine;
    }

    public Stack<Integer> fillMagazine(Stack<Integer> magazine, int bulletNumber) {
        if (magazine.size() < 8) {
            magazine.push(bulletNumber);
            System.out.println("+1 bullet filled in " + name);
        } else {
            System.out.println("Nice  " + name + " magazine is full!!!");
        }
        return magazine;
    }

    public Stack<Integer> shoot(Stack<Integer> magazine) {
        if (!magazine.isEmpty()) {
            magazine.pop();
            System.out.println("Shooted from " + name);
        } else {
            System.out.println(name + "'s magazine is empty!");
        }
        return magazine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stack<Integer> getMagazine() {
        return magazine;
    }

    public void setMagazine(Stack<Integer> magazine) {
        this.magazine = magazine;
    }
}

