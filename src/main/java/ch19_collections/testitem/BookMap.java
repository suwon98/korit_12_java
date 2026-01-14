package ch19_collections.testitem;

import java.util.*;

public class BookMap {
    Scanner scanner = new Scanner(System.in);
    Map<String, Integer> bookMaps = new HashMap<>();
    Collection<Integer> values = bookMaps.values();
    Set<String> keySet = bookMaps.keySet();
    List<String> bookName = new ArrayList<>();
    List<Integer> bookNum = new ArrayList<>();

    public void bookMapProgram() {
        int num = 0;
        int num2 = 0;
        String name = "";
        boolean searchKeyFlag1 = bookMaps.containsKey(name);
        while(true) {
            System.out.println("--- 도서 재고 관리 프로그램 ---");
            System.out.println("1. 도서 추가\n" +
                    "2. 재고 수정\n" +
                    "3. 재고 목록\n" +
                    "4. 종료");
            System.out.print("메뉴를 선택하세요 >>> ");
            num = scanner.nextInt();
            scanner.nextLine();
            if(num == 1) {
                System.out.print("새 도서명을 도서를 입력하세요 >>> ");
                name = scanner.nextLine();
                if(searchKeyFlag1 == true) {
                    System.out.println("이미 재고에 있는 도서입니다.");
                    break;
                }else {
                    System.out.print("재고 수량을 입력하세요 >>> ");
                    num2 = scanner.nextInt();
                    System.out.println(name + " 도서가 " + num2 + " 권 추가되었습니다.");
                    bookMaps.put(name,num2);
                }
            }else if(num == 2) {
                System.out.print("재고를 변경할 도서명을 입력하세요 >>> ");
                name = scanner.nextLine();
                if (searchKeyFlag1 == true) {
                    System.out.println("해당 도서가 재고에 없습니다.");
                }else {
                    System.out.print("새로운 재고 수량을 입력하세요 >>> ");
                    num2 = scanner.nextInt();
                    bookMaps.replace(name,num2);
                    System.out.println(name + " 도서가 " + num2 + " 권으로 변경되었습니다.");
                }
            }else if(num == 3) {
                bookName.addAll(keySet);
                bookNum.addAll(values);
                for(int i = 0; i < bookName.size(); i++) {
                    System.out.println("도서명 : " + bookName.get(i) + ", 재고 수량 : "+ bookNum.get(i) + " 권\n");
                }
            }else if(num == 4) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        BookMap bookMap1 = new BookMap();
        bookMap1.bookMapProgram();

    }
}
