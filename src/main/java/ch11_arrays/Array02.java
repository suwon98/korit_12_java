package ch11_arrays;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 명의 학생을 등록하시겠습니까? >>> ");
        int choice = scanner.nextInt();
        String[] humans = new String[choice];
        double[] scores = new double[choice];
        double sumScores = 0;
        for (int i = 0; i < choice; i++) {
            System.out.print((i + 1 )+ " 번 학생의 이름을 동록하세요 >>> ");
            scanner.next();
            humans[i] = scanner.nextLine();
        }
        for (int i = 0; i < choice; i++) {
            System.out.print(i + 1 + " 번 학생의 점수를 입력하세요 >>> ");
            scores[i] = scanner.nextDouble();
            sumScores += scores[i];
        }

        System.out.println("학생들의 점수 총합은 " + sumScores + "점 입니다.");
        System.out.println(humans[0]);
        System.out.println(scores[0]);
    }
}
