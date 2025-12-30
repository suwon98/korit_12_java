package ch08_classes.students;

public class Student {
    // 필드 정의 영역
    int studentCode;
    String name;
    double score;
    // 생성자 정의 영역
    public Student() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }
    public Student(int studentCode) {
        this.studentCode = studentCode;
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
    }
    public Student(String name) {
        this.name = name;
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
    }
    public Student(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
    }
    public Student(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
    }
    // 메서드 정의 영역
    public void showInfo() {
        System.out.println();
        System.out.println(name + " 학생의 정보입니다.");
        System.out.println("학번 : " + studentCode);
        System.out.println("이름 : " + name);
        System.out.println("점수 : " + score);
    }
}
