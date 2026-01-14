package ch19_collections.testitem;

import java.util.*;

public class Meeting {
    Scanner scanner = new Scanner(System.in);
    Set<String> nameSet = new HashSet<>();
    List<String> finalName = new ArrayList<>();

    public void setName() {
        String name = "";
        System.out.println("--- 모임 참석자 명단 관리 ---" +
                "\n[ 종료 ] 라고 입력하면 프로그램이 종료합니다.");
        while (true) {
            System.out.print("참석자 이름을 입력하세요 >>> ");
            name = scanner.nextLine();
            nameSet.add(name);
            if (name.equals("종료")) {    // if문 순서 바꾸면 24번 줄에 .remove() 필요 없음
                System.out.println("프로그램이 종료되었습니다.");
                break;
            }
        }
        finalName.addAll(nameSet);
        finalName.remove("종료");
        Collections.sort(finalName, Comparator.reverseOrder());
        System.out.println("--- 최종 참석자 명단 ---");
        for(int i = 0; i < finalName.size(); i++) {
            if(i == finalName.size()-1) {
                System.out.println(finalName.get(i));
                break;
            }
            System.out.print(finalName.get(i) + ", ");
        }
    }

    public static void main(String[] args) {
        Meeting meeting = new Meeting();
        meeting.setName();
    }
}
