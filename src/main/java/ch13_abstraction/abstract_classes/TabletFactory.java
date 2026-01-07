package ch13_abstraction.abstract_classes;

public class TabletFactory extends Factory {


    @Override
    public void produce(String model) {

    }

    @Override
    public void manage() {
        System.out.println("태블릿 공장을 생성합니다.");
    }

    public void upgrade(String model) {
        System.out.println(model + "로 업그레이드합니다.");
    }
}
