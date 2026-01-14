package ch19_collections;

import java.util.*;

public class FieldTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> fieldTrips = new ArrayList<>();
        List<String> finalFieldTripsList = new ArrayList<>();
        Set<String> fieldTripsSet = new HashSet<>();
        int num = 0;
        System.out.print("몇 명의 학생이 수학 여행지를 입력하시겠습니까? ");
        num = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < num; i++) {
            System.out.print((i + 1) + " 번 학생의 수학 여행지를 입력하세요 >>> ");
            String fieldTrip = scanner.nextLine();
            fieldTrips.add(fieldTrip);
        }
        for (int i = 0; i < fieldTrips.size(); i++) {
            System.out.println((i+1) + " 번 학생의 후보지 : " + fieldTrips.get(i));
        }
        fieldTripsSet.addAll(fieldTrips);
        finalFieldTripsList.addAll(fieldTripsSet);

        System.out.println("수학 여행 후보지는");
        for(String elem : finalFieldTripsList) {
            System.out.println(elem);
        }
        System.out.println("입니다.");
    }
}
