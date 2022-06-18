package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class ArrayDiff {

//    public static int[] arrayDiff(int[] a, int[] b) {
//        int[] c = new int[0];
//
//        if(b.length == 0)
//            return a;
//
//        Set<Integer> uniqueValues = new HashSet<>();
//        for (int e : b) {
//            if (uniqueValues.add(e)) {
//                c = Arrays.stream(a).filter(aa -> aa != e)
//                        .filter(f -> !uniqueValues.contains(f)).toArray();
//            }
//        }
//
//        return c;
//    }

    public static int[] arrayDiff(int[] a, int[] b) {
        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
    }


}
