package csc.assignment;

import java.util.ArrayList;
import java.util.HashMap;

/*
* This Java program receives the users input
* then pay him or her according to marital status
*/

public class Assigment1 {

    private static HashMap<String, Integer> db = new HashMap<String, Integer>();
    private static ArrayList<Integer> memory = new ArrayList<Integer>();

    // singleton
    public static Assigment1 getInstance() {
        db.put("single", 500);
        db.put("married", 2000);
        db.put("seperated", 3000);
        db.put("divorced", 4000);
        return new Assigment1();
    }

    // switch statement function

    // return function
    public int getSalaryFor(String status) {
        // push to array
        int value = db.get(status);
        memory.add(value);
        return value;
    }

    // total amount paid to all beneficiaries\
    public int getTotalPayment() {
        int value = 0;
        for (Integer integer : memory)
            value += integer;
        return value;
    }

    // erase memnory
    public void clear() {
        memory.clear();
    }

}
