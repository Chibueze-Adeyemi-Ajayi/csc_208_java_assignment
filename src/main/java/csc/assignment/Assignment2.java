package csc.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// java program that runs 20 times asking for csc lecturer names, rank
// then display the results (individual price, total, and average) at the end of the program
public class Assignment2 {

    // two dimensional hashmap
    private final static HashMap<String, Integer> salaries = new HashMap<String, Integer>();

    private static <E> void print(E data) {
        System.out.println(data);
    }

    public static Assignment2 getInstance() {
        salaries.put("professor", 5000);
        salaries.put("associate Professor", 2999);
        salaries.put("senior Lecturer", 2499);
        salaries.put("lecturer", 1999);
        return new Assignment2();
    }

    public void initAssignmentOperations() throws Exception {
        for (int i = 0; i < 12; i++) {
            Scanner scanner = new Scanner(System.in);
            while (scanner.hasNextLine()) {
                print("Input lecturer " + i + " name, rank");
                String[] input = scanner.nextLine().split(",");
                salaries.put(input[0], Integer.parseInt(input[1]));
            }
        }
        computeData();
    }

    private void computeData() {
        print("--------------------------------------");
        print("Computing data...");
        int x = 0, i = 0;
        print("--------------------------------------");
        for (Map.Entry<String, Integer> set : salaries.entrySet()) {
            String name = set.getKey();
            int salary = set.getValue();
            print(name + " : " + salary);
            x += salary;
            i++;
        }
        int total_salary = x, average_salary = total_salary / i;
        print("--------------------------------------");
        print("Total: " + total_salary + " | Average: " + average_salary);
        print("--------------------------------------");
    }

}
