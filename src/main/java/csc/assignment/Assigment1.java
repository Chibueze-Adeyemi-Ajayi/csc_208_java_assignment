package csc.assignment;

import java.util.HashMap;

/*
* This Java program receives the users input
* then pay him or her according to marital status
*/

public class Assigment1 {

    private static HashMap<String, Integer> db = new HashMap<String, Integer>();

    // singleton
    public static Assigment1 getInstance() {
        db.put("single", 500);
        db.put("married", 2000);
        db.put("seperated", 3000);
        db.put("divorced", 4000);
        return new Assigment1();
    }

}
