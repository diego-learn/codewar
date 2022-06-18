package com.company;

import java.util.stream.IntStream;

public class MultiplesOf3or5 {

    public static int solution (int number) {

        if(number < 0) {
            return 0;
        }

        var i = 1;
        var total = 0;
        while (i < number) {
            if(i % 3 == 0 || i % 5 == 0) {
              total = total + i;
            }
            i++;
        }
        return total;
    }

    public int solution2(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
    }
}
