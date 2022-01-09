# 더 자바, Java 8 학습
https://www.inflearn.com/course/the-java-java8/dashboard
자바 8 흡수

## **Java 8 소개**
  * 자바 8
    * 현재 자바 개발자 중 약 72%가 사용중.
      * https://www.jetbrains.com/lp/devecosystem-2021/java/
    * 주요 기능
      * 람다 표현식
      * 메소드 레퍼런스
      * 스트링 API
      * Optional\<T\>
      * ...

## **함수형 인터페이스와 람다**
  * 함수형 인터페이스와 람다 표현식 소개
    * 함수형 인터페이스 (Functional Interface)
      * 추상 메소드를 딱 하나만 가지고 있는 인터페이스
    * 람다 표현식 (Lambda Expressions)
      * 함수형 인터페이스의 인스턴스를 만드는 방법으로 쓰일 수 있다.
      * 메소드를 매개변수, 리턴 타입, 변수로 만들어 사용할 수도 있다.
    * 고차 함수 (Higher-Order Function)
      * 함수가 함수를 매개변수로 받을 수 있고 함수를 리턴할 수도 있다.

  * Java가 기본으로 제공하는 함수형 인터페이스
    * https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html
    * 자바에서 미리 정의해둔 자주 사용할만한 함수 인터페이스
    * Function\<T, R\>
      * T 타입을 받아서 R 타입을 리턴하는 함수 인터페이스
        * R apply(T t)
      * 함수 조합용 메소드
        * andThen
        * compose
    * BiFunction\<T, U, R\>
      * 두 개의 값(T, U)를 받아서 R 타입을 리턴하는 함수 인터페이스
        * R apply(T t, U u)
    * Consumer\<T\>
      * T 타입을 받아서 아무 값도 리턴하지 않는 함수 인터페이스
        * void Accpet(T t)
      * 함수 조합용 메소드
        * andThen
    * Supplier\<T\>
      * T 타입의 값을 제공하는 함수 인터페이스
        * T get()
    * Predicate\<T\>
      * T 타입을 받아서 boolean을 리턴하는 함수 인터페이스
        * boolean test(T t)
      * 함수 조합용 메소드
        * And
        * Or
        * Negate
    * UnaryOperator\<T\>
      * Function\<T, R\>의 특수한 형태로, 입력값 하나를 받아서 동일한 타입을 리턴하는 함수 인터페이스
    * BinaryOperator\<T\>
      * BiFunction\<T, U, R\>의 특수한 형태로, 동일한 타입의 입력값 두 개를 받아 리턴하는 함수 인터페이스
