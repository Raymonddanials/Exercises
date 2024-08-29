//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
// we need import class java.util.scanner to obtain information entered by the user
import java.util.Scanner;
//We will use java.util.scanner so that it can receive inputs
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n" +
                "This program shows if the number is a multiple of 100");
        System.out.println("Enter number");
        int num = in.nextInt();
        //We use a conditional to know if it is a multiple of 100, the % operator is used to know the remaining value of a division if it is equal ==0 it is a multiple of 100
        /*If it is not a multiple of 100, it will give another result*/
        if (num % 100 == 0) {
            System.out.println("The number " + num + " is a multiple of 100");
        } else {
            System.out.println("The number " + num + " is not multiple of 100");
        }

    }
}