package com.company;


import java.util.ArrayList;


public class StringSplit {

    public static String[] solution(String s) {

        var l = new ArrayList<String>();
        var v = new String[s.length()];
        for (int i = 0; i < s.length(); i += 2) {

            if (s.length() > i + 1)
                l.add(s.substring(i, i + 2));
            else
                l.add(s.substring(i, i + 1)+"_");

        }
        v = l.toArray(new String[0]);

        return v;

    }
}
