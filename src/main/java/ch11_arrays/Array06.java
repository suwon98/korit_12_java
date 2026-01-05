package ch11_arrays;

import java.util.Arrays;

/*
    int[] scores = { 100, ... 10};
    총합과 평균을 계산해서 다음과 같이 출력
    총점 : 몇
    평균 : 몇 (double 형 변환)

    // 총합 메서드 - calcSum()
    // 평균 메서드 - calcAvg()
    // 총합과 평균을 출력하는 곳에서 두 개의 메서드 호출
    // printSumAndAvg()
 */
public class Array06 {
    int[] scores = {100, 90, 80, 70, 60, 50, 40, 30, 20 ,10};
//    int sum = 0;
//    double avg = 0;
//    public void calcSum() {
//        for(int i = 0; i < scores.length; i++) {
//            sum += scores[i];
//        }
//        System.out.println("총점 : " + sum + "점");
//    }
//    public void calcAvg() {
//        avg = ((double) sum / scores.length);
//        System.out.println("평균 : " + avg + "점");
//        }
//
//    public void printSumAndAvg() {
//        sum = 0;
//        calcSum();
//        calcAvg();
//    }
    private double calcSum(int[] scores) {
        double sum = 0;
        sum = Arrays.stream(scores).sum();      // 반복문으로 쓰셔도 무방한데 너무 반복해서 그냥 이거 씀.
        return sum;
    }

    private double calcAvg(int[] scores) {
        double avg = 0;
        avg = Arrays.stream(scores).average().getAsDouble();    // 마찬가지
        return avg;
    }

    public void printSumAndAvg(int[] scores) {
        double sum = calcSum(scores);
        double avg = calcAvg(scores);
        System.out.println("총점 : " + sum + "점\n평균 : " + avg + "점");
    }

    // method overeloading을 통해서 int[] 배열만 받는게 아니라 double[]배열을 받더라도 연산을 할 수 있도록 준비

    private double calcSum(double[] scores) {
        double sum = 0;
        sum = Arrays.stream(scores).sum();      // 반복문으로 쓰셔도 무방한데 너무 반복해서 그냥 이거 씀.
        return sum;
    }

    private double calcAvg(double[] scores) {
        double avg = 0;
        avg = Arrays.stream(scores).average().getAsDouble();    // 마찬가지
        return avg;
    }

    public void printSumAndAvg(double[] scores) {
        double sum = calcSum(scores);
        double avg = calcAvg(scores);
        System.out.println("총점 : " + sum + "점\n평균 : " + avg + "점");
    }

    public static void main(String[] args) {
        Array06 array06 = new Array06();
        array06.printSumAndAvg(array06.scores);

        double[] scores2 = {4.5, 4.4};

    }
}

