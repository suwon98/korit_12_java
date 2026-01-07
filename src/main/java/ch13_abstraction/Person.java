package ch13_abstraction;

public abstract class Person {
    // field 선언
    private String name;
    // ALLArgsConstructor
    public Person(String name) {
        this.name = name;
    }
    // method 예시
    public abstract void introduce();
}
