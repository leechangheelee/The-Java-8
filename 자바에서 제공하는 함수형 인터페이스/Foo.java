package me.whiteship.java8to11;

import java.util.function.*;

public class Foo {

    public static void main(String[] args) {
        // Java가 기본으로 제공하는 함수형 인터페이스
        // Function

//        // Integer를 받아서 Integer를 리턴
//        Function<Integer, Integer> plus10 = x -> x + 10;
//        Function<Integer, Integer> multiply2 = x -> x * 2;
//
//        //System.out.println(multiply2.apply(1));
//        //System.out.println(plus10.andThen(multiply2).apply(2));
//
//        //compose : x2 를 먼저하고 +10을 수행
//        Function<Integer, Integer> multiplyAndPlus10 = plus10.compose(multiply2);
//        System.out.println(multiplyAndPlus10.apply(2));
//
//        //andThen : +10을 먼저하고 x2를 수행
//        Function<Integer, Integer> plus10AndMultiply = plus10.andThen(multiply2);
//        System.out.println(plus10AndMultiply.apply(2));

        // Consumer
//        Consumer<Integer> printT = x -> System.out.println(x);
//        printT.accept(10);

        // Supplier
//        Supplier<Integer> get10 = () -> 10;
//        System.out.println(get10.get());

        // Predicate
//        Predicate<String> startsWithChanghee = (s) -> s.startsWith("Changhee");
//        Predicate<Integer> isOdd = (i) -> i % 2 != 0;
//
//        System.out.println(startsWithChanghee.test("dChangheeasdfasdf"));
//        System.out.println(isOdd.test(3));

        // UnaryOperator
        UnaryOperator<Integer> plus10 = (i) -> i + 10;
        UnaryOperator<Integer> multiply2 = (i) -> i * 2;
        System.out.println(plus10.andThen(multiply2).apply(2));
    }
}
