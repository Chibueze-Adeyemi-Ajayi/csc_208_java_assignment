package csc.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// java program that runs 20 times asking for csc lecturer names, rank
// then display the results (individual price, total, and average) at the end of the program
public class Assignment2 {

    // two dimensional hashmap
    private final static HashMap<String, Integer> salaries = new HashMap<String, Integer>();\

    private static <E> void print(E data) {
        System.out.println(data);
    }

    public static Assignment2 getInstance() {
        salaries.put("professor", 5000);
        salaries.put("associate Professor", 2999);
        salaries.put("senior Lecturer", 2499);
        salaries.put("lecturer", 1999);
        for (int i = 0; i < 12; i++) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                print("Input lecturer " + i + " name, rank");
                String[] input = scanner.nextLine().split(",");
                salaries.put(input[0], input[1]);
            }
        }
        return new Assignment2();
    }

    private void computeData() {
        for (iterable_type iterable_element : iterable) {

        }
    }

}
