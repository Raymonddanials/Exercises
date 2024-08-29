//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n" +
                "This program shows if the number is a multiple of 100");
        System.out.println("Enter number");
        int num = in.nextInt();
        if (num % 100 == 0) {
            System.out.println("The number " + num + " is a multiple of 100");
        } else {
            System.out.println("The number " + num + " is not multiple of 100");
        }

    }
}