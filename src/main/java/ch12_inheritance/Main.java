package ch12_inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.move();
        animal1.setAnimalName("동물");
        animal1.setAnimalAge(12);


        // Animal 클래스의 지시사항을 완료하시고, Tiger클래스의 객체를 하나 생성하시오.
        Tiger tiger1 = new Tiger();
        tiger1.setAnimalName("호랑이");
        tiger1.setAnimalAge(1);
        System.out.println("이 호랑이의 이름은" +
                tiger1.getAnimalName() + "이고, 나이는" +
                tiger1.getAnimalAge() + "살입니다.");
        tiger1.move();
        tiger1.hunt();;
        tiger1.hunt("사료");
//        animal1.hunt;     // 부모 클래스는 자식 클래스의 메서드를 호출할 수 없음

        // tiger1에 몸무기 1.4로 입력하고
        // 호랑이의 몸무게는 1.4t입니다.
        // 라고 출력하시오
        tiger1.setWeight(1.4);
        System.out.println(tiger1.getAnimalName() + "의 몸무게는 " + tiger1.getWeight() + "t입니다.");

        System.out.println("-------------------------------------");
        Human human1 = new Human();
        human1.move();
        human1.setAnimalName("남수원");
        human1.setAnimalAge(29);
        System.out.println("안녕하세요, 제 이름은 " + human1.getAnimalName()
                + "이고 나이는 " + human1.getAnimalAge() + "입니다.\n내년에는"
                + (human1.getAnimalAge()+1) + "살이 됩니다.");
        human1.read("자바의 기초");

    }
}
