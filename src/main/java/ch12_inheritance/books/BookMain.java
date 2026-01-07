package ch12_inheritance.books;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("자바의 정석", "남궁성");
        book1.showInfo();

        EBook EBook1 = new EBook("스프링 입문", "이강준", 5.2, "EPUB");
        EBook1.setFormat("PDF");
        System.out.println("이 전자책의 포맷은 " + EBook1.getFormat() + "입니다.");
        EBook1.showInfo();
    }
}
