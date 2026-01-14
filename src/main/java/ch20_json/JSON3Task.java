//package ch20_json;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Setter;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//@AllArgsConstructor
//@Data
//class Book {
//    private Long bookId;
//    private String title;
//    private String author;
//    List<String> categories;
//
//}
//
//public class JSON3Task {
//    public static void main(String[] args) {
//        Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
//        Book book = new Book(101L, "자바 마스터","안선생",new ArrayList<>());
//        book.categories.add("프로그래밍");
//        book.categories.add("컴퓨터공학");
//        String jsonBook1 = gsonBuilder.toJson(book);
//        System.out.println(jsonBook1);
//
//        Map<String, Object> bookMap = gsonBuilder.fromJson(jsonBook1, Map.class);
//        System.out.println("도서 제목 : " + bookMap.get("title"));
//        Book book2 = new Book(102L,"파이썬 입문","김철수",new ArrayList<>());
//        book2.categories.add("데이터 분석");
//        List<Book> booksList1 = new ArrayList<>();
//        booksList1.add(book);
//        booksList1.add(book2);
//        String jsonBook2 = gsonBuilder.toJson(booksList1);
//        System.out.println(jsonBook2);
//    }
//}
