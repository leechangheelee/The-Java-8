package me.whiteship.java8to11;

// 추상메서드가 하나만 있으면 함수형 인터페이스
// 추상메서드가 두개이상 있으면 함수형 인터페이스가 아님!
// 추상메서드 아닌 메서드는 여러개 있어도 됨

// 아래 어노테이션 필요
@FunctionalInterface
public interface RunSomething {
    abstract int doIt(int number); // abstract 생략가능

    //static 메서드 정의가능. 8~
    static void printName() {
        System.out.println("Changhee");
    }

    //default 메서드도 정의가능. 8~
    default void printAge() {
        System.out.println("33");
    }
}
