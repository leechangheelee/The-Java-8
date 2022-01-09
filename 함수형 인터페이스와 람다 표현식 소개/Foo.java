package me.whiteship.java8to11;

public class Foo {

    public static void main(String[] args) {
	// write your code here
        // Java 8 이전
        /*RunSomething runSomething = new RunSomething() {
            // 익명 내부 클래스 anonymous inner class
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };*/

        // 익명 내부 클래스 anonymous inner class
        // 위의 코드와 동일함
        //RunSomething runSomething = () -> System.out.println("Hello");

        // 아래의 경우는 순수한 함수로 보기 어려움
        RunSomething runSomething = new RunSomething() {
            int baseNumber = 10;

            @Override
            public int doIt(int number) {
                baseNumber++;
                return number + baseNumber;
            };
        }
    }
}
