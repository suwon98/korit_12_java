package ch18_generic.bmi;
/*
    printResult(double bmi)를 적용하고 조건문을 사용하여
    김일 님의 키는 000 cm, 몸무게는 000 kg, bmi 지수는 000으로 저체중/정상/비만전단계/1단계비만/2단계비만/3단계 비만입니다
    라고 출력할 수 있도록 작성
 */
public class Bmi{

    private double calcBmi(Person person) {
        double bmi = 0;
        String name = person.getName();
        double height = person.getHeight() * 0.01;  // 여기서만 m법으로 쓰니까 별개의 변수를 선언하지 않았습니다.
        double weight = person.getWeight();
        bmi = weight / (height*height);
        bmi = person.getWeight()/(height*height);
        return bmi;
    }
    public void printResult(Person person) {
        String name = person.getName();
        double height = person.getHeight();
        double weight = person.getWeight();
        double bmi = calcBmi(person);
        String result = "";
        if(bmi < 18.5) {
            result = "저체중";
        } else if(bmi < 23) {
            result = "정상";
        } else if (bmi < 25) {
            result = "비만 전 단계";
        } else if (bmi < 30) {
            result = "1단계 비만";
        } else if (bmi < 35) {
            result = "2단계 비만";
        } else result = "3단계 비만";
        System.out.println(name + "님의 키는 " + height + "cm, 몸무게는 " +
                weight + "kg, bmi 지수는 " + result + "으로 " +  "입니다.");
    }




}
