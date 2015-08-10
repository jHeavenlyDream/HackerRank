package com.hackerrank.java.bignumber;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Ivanov on 07.08.2015.
 */
public class JavaBigDecimal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<BigDecimal> list = new ArrayList<BigDecimal>();
        int n  = in.nextInt();
        int i = 0;
        while (i < n){
            list.add(in.nextBigDecimal());
            i++;
        }

        Collections.sort(list, Collections.reverseOrder());

        for(BigDecimal d: list) System.out.println(d);
    }
}
