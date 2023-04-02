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

        print("Hello, I'm here to solve CSC 201 Assignment 1.\nI want you to kindly input marital status, seperate each by comma ',' then I'll print the salary and the overall.\nThank you dear");
        Scanner x = new Scanner(System.in);
        while (x.hasNextLine()) {
            print(x.nextLine());
            x.close();
        }

    }
}