package FundamentalsBasic;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Uzraksti vārdu, kuru gribi, lai programma uzraksta no otras puses...");
        System.out.println("Write name witch you want see write from other side...");
        String vards = scan.nextLine();

        String v1= vards;
        System.out.println(v1);
        String apgriestaisvards = "";
        String dotaisvards = "";
        String[] a = v1.split(" ");
        for (int i = 0; i<=a.length-1; i++) {
            for (int x=a[i].length()-1; x>=0; x--) {
                dotaisvards += a[i].charAt(x);
            }
            apgriestaisvards += dotaisvards;
            apgriestaisvards += " ";
            dotaisvards = "";
        }
        System.out.println("Vards no otras puses: "+apgriestaisvards);
        System.out.println("\n\n");

        ////////
        ////////
        ////////

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");

        String Name = sc.next();
        String normalText = "Madonna and " + Name + " knows Trump ";

// reverse string builder
        StringBuilder reverseString = new StringBuilder();

// Put words from String in Stack
        Stack<String> myStack = new Stack();

        StringTokenizer tokenizer = new StringTokenizer(normalText, " ");

        while (tokenizer.hasMoreTokens()) {
            myStack.push(tokenizer.nextToken());
        }

//Pop each word from stack and append in builder

        while (!myStack.empty()) {
            reverseString.append(myStack.pop() + " ");
        }

        System.out.println("Text before reverse -->  " + normalText);
        System.out.println("Reverse text -->" + reverseString.toString());

//First test use String Tokenizer lib, but second is more simple variant.

        String testHello = "Hello World Test";

        StringBuilder reverse = new StringBuilder(testHello).reverse();

        System.out.println("\n\nOriginal String -> " + testHello);
        System.out.println("Reverse String -> " + reverse);

    }
}
