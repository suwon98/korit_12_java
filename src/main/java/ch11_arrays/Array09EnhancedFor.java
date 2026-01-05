package ch11_arrays;

public class Array09EnhancedFor {
    public static void main(String[] args) {
        String[] persons = {"김일" , "김이", "김삼", "김사", "김오"};
        /*
            실행 예
            1 번 : 김일
            2 번 : 김이
            3 번 : 김삼
            4 번 : 김사
            5 번 : 김오
            로 출력되도록 일반 for문으로 한 번 / 향상된 for문으로 한 번
         */
        for (int i = 0; i < persons.length; i++) {
            System.out.println((i + 1) + " 번 : " + persons[i]);
        }
        System.out.println();
        int i = 0;
        for (String person : persons) {
                System.out.println(++i + " 번 : " + person);
        }
//        int i = 0;
//        for (String person : persons) {
//            while (i < persons.length) {
//                System.out.println((i + 1) + " 번 : " + person);
//                i++;
//            }
//        }
    }
}
