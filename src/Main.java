//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Este programa te muestra si el número es múltiplo de 100");
        System.out.println("Ingrese su número");
        int num = in.nextInt();
        if (num % 100 == 0) {
            System.out.println("The number " + num + " is a multiple of 100");
        } else {
            System.out.println("The number " + num + " is not multiple of 100");
        }

    }
}