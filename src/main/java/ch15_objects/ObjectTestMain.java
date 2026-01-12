package ch15_objects;

public class ObjectTestMain {
    public static void main(String[] args) {
        ObjectTest objectTest1 = new ObjectTest();
        objectTest1.setName("김일");
        objectTest1.setAddress("부산광역시 연제구");
        objectTest1.showInfo();
        ObjectTest objectTest2 = new ObjectTest("김이", "서울특별시 종로구");
        objectTest2.showInfo();
        System.out.println(objectTest1.toString());
        System.out.println("----일반----");
        System.out.println(objectTest1);
        System.out.println("----- equals() -----");

        String example = "안녕하세요";

        boolean result1 = "안녕하세요" == example;
        System.out.println(result1);    // true

        String[] strArray = {"안녕하세요", "안녕"};
        boolean result2 = "안녕하세요" == strArray[0];
        boolean result3 = example == strArray[0];
        System.out.println(result2);    // true
        System.out.println(result3);    // true

        ObjectTest test1 = new ObjectTest("안녕하세요", " 안녕");
        boolean result4 = "안녕하세요" == test1.getName();
        System.out.println(result4);
        boolean result5 = strArray[0] == test1.getName();
        boolean result6 = example == test1.getName();
        System.out.println(result5);
        System.out.println(result6);

        String example2 = new String("안녕하세요");
        boolean result7 = "안녕하세요" == example2;
        System.out.println(result7);    // false
        String example3 = new String(example);
        boolean result8 = example3 == example;
        System.out.println(result8);    // false

        boolean result71 = "안녕하세요".equals(example2);
        System.out.println(result71);   // true
        boolean result81 = example3.equals(example);
        System.out.println(result81);   // true
    }
}
/*
    ObjectTestMain 클래스에
    object1 객체를 기본 생성자를 통해 생성하고 이름에 김일 / 주소 부산광역시 연제구 입력
    showInfo() 호출
    object2 객체 김이 / 서울특별시 종로구
 */
