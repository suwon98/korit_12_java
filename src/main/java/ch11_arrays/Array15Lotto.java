package ch11_arrays;

import java.util.Random;

public class Array15Lotto {
    public static void main(String[] args) {
        // 일단 1 ~ 45 까지의 임의의 값을 집어넣기 위해 두 가지 방법을 사용할 수 있습니다.
        // # 1 - random.nextInt(45) + 1 을 사용하는 방법
        // # 2 - Math.random() : 0 ~ 0.999999 사이의 임의의 실수를 return함
        System.out.println(Math.random());
        System.out.println(Math.random()*10);   // 0 ~ 9까지의 값을 return 하려면
        // 그럼 Math.random()을 사용했을 때 1 ~ 45를 return하려면
        System.out.println(Math.random()*45 + 1);
        Random random = new Random();
        Integer[] lottoNumber = new Integer[6];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < lottoNumber.length; j++){
                lottoNumber[j] = random.nextInt(45) + 1;
                System.out.print(lottoNumber[j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < lottoNumber.length; j++){
                lottoNumber[j] = random.nextInt(45) + 1;
                if ( lottoNumber[j].equals(j) == lottoNumber[j].equals(j)) {
                    lottoNumber[j] = random.nextInt(45)+ 1;
                }
                System.out.print(lottoNumber[j] + " ");
            }
            System.out.println();
        }

    }
}
