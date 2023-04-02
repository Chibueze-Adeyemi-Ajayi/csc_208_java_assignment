package csc.assignment;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    private static <E> void print(E data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner x = new Scanner(System.in);
        print("Jilo Billionaire");
        while (x.hasNextLine()) {
            print(x.nextLine());
        }
    }
}
