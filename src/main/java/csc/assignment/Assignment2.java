package csc.assignment;

import java.util.HashMap;

public class Assignment2 {

    // two dimensional hashmap
    private final static HashMap<String, HashMap<Integer, Integer>> salaries = new HashMap<String, HashMap<Integer, Integer>>();

    public static Assignment2 getInstance() {

        return new Assignment2();
    }

}
