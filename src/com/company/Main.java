package com.company;


import java.util.Arrays;

public class Main {

     static PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f'), 4);

    public static void main(String[] args) {

        System.out.println(Arrays.toString(StringSplit.solution("test")));
//       System.out.println( MultiplesOf3or5.solution(5));
//        Arrays.stream(ArrayDiff.arrayDiff(new int[]{1, 2, 3}, new int[]{3})).forEach(System.out::println);

//        //  System.out.println(helper.pageCount());
//       System.out.println(helper.pageItemCount(0));
//        //  System.out.println(helper.pageIndex(0));
	// write your code here
    }
}
