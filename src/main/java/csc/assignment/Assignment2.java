package csc.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// java program that runs 20 times asking for csc lecturer names, rank
// then display the results (individual price, total, and average) at the end of the program
public class Assignment2 {

    // two dimensional hashmap
    private final static HashMap<String, ArrayList<Integer>> salaries = new HashMap<String, ArrayList<Integer>>();

    private static <E> void print(E data) {
        System.out.println(data);
    }

    public static Assignment2 getInstance() {
        salaries.put("professor",  );
        for (int i = 0; i < 12; i++) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                print("Input lecturer " + i +" name");
                print("Input lecturer " + i +" rank");
            }
        }
        return new Assignment2();
    }

    private void computeData() {
        for (iterable_type iterable_element : iterable) {

        }
    }

}
