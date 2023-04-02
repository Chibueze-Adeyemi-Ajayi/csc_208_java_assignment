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

    private static void question1() {

        print("Hello, I'm here to solve CSC 201 Assignment 1.\nI want you to kindly input marital status, seperate each by comma ',' then I'll print the salary and the overall.\nThank you dear");
        Scanner x = new Scanner(System.in);
        print("--------------------------------------");
        Assigment1 ass_1 = Assigment1.getInstance();
        int i = 0;
        while (x.hasNextLine()) {
            i++;
            String[] statuses = x.nextLine().split(",");
            for (String status : statuses) {
                int score = ass_1.getSalaryFor(status);
                print(score);
            }
            print("--------------------------------------");
            print("TOTAL:" + ass_1.getTotalPayment());
            print("--------------------------------------");
            try {
                if (i >= statuses.length)
                    x.close();
            } catch (Exception e) {
            } finally {
                ass_1.clear();
            }
        }
    }

    public static void main(String[] args) throws Exception {

    }
}