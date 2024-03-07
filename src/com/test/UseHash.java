package com.test;

import java.util.HashMap;

public class UseHash {
    public static void main(String[] args) {
        HashMap<String, Integer> aMap = new HashMap<>();
        String parm0 = null, parm1 = null;
        if(args.length == 2){
            parm0 = args[0];
            parm1 = args[1];
        }
        //@SuppressWarnings("unchecked")
        doWork(aMap,parm0, Integer.parseInt(parm1));
        Integer test = aMap.get(parm0);
        System.out.println(test.toString());
    }

    private static void doWork(HashMap<String, Integer> aMap, String parm0, Integer parm1) {
        aMap.put(parm0, parm1);
    }
}
