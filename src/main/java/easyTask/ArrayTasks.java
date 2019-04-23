package easyTask;

//We need load magazine full with bullets and after than shot and cont how much left.

public class ArrayTasks {
    public static void main(String[] args) {
        int[] numberArray;
        numberArray = new int[10];
        for (int i = 0; i < numberArray.length; i++) {
            numberArray[i] = i + 1;
            System.out.print("Bullet load in magazine. Now we have " + numberArray[i] + " bullets \n");
        }
        System.out.println("\n now we have full magazine \n ");

        for (int a = numberArray.length; a > 0; a--) {
            System.out.println("shot " + (a - 1) + " left");
        }
        System.out.println("\n AMMO!!! Give me more bullets");
    }
}
