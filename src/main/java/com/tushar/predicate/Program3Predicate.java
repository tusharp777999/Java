package com.tushar.predicate;

import java.util.function.Predicate;

public class Program3Predicate {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanPredicate = greaterThan -> greaterThan > 10;
        Predicate<Integer> divideByPredicate = divideBy -> divideBy % 2 == 0;

        //Use of test().
        System.out.println(greaterThanPredicate.test(11));
        System.out.println(divideByPredicate.test(10));

        //Use of negate().
        Predicate<Integer> negatePredicate = greaterThanPredicate.negate();
        System.out.println(negatePredicate.test(9));

        //Use of and().
        System.out.println(greaterThanPredicate.and(divideByPredicate).test(12));
        Predicate<Integer> bothAndPredicate = greaterThanPredicate.and(divideByPredicate);
        System.out.println(bothAndPredicate.test(15));

        //Use of or().
        System.out.println(greaterThanPredicate.or(divideByPredicate).test(9));
        Predicate<Integer> bothOrPredicate = greaterThanPredicate.or(divideByPredicate);
        System.out.println(bothOrPredicate.test(15));

        //Use of isEqual().
        Predicate<String> isEqualPredicate = Predicate.isEqual("Tushar");
        System.out.println(isEqualPredicate.test("Tushar"));

        //Use of not().
        Predicate<String> notPredicate = Predicate.not(isEqualPredicate);
        System.out.println(notPredicate.test("Tushar"));
    }
}
