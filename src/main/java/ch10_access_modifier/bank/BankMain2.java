package ch10_access_modifier.bank;

public class BankMain2 {
    public static void main(String[] args) {
        Bank2 bank0 = new Bank2(123456, "김영", 12345, 12345);
        System.out.println(bank0.getAccountNum());      // 결과값 : 0
        System.out.println(bank0.getAccountHolder());   // 결과값 : null
        System.out.println(bank0.getBalance());         // 결과값 : 0
        System.out.println(bank0.getPinNumber());       // 결과값 : 0
        // 이상의 경우에도
        System.out.println(bank0);      // 이상에서 필드에 값이 없지만 객체는 생성되어있습니다.
        bank0.setAccountNum(123456);
        System.out.println(bank0.getAccountNum());

        // 즉 생성자가 호출은 되었으나 field에 값을 집어넣는 단계에서 메서드가 정지되었습니다.
        // 결과적으로 객체 생성은 되었지만 필드에 값이 없는 상태이기 때문에
        // 6번 코드 라인의 경우 기본 생성자를 통해 객체를 생성한 것과 같은 결과값을 가지게 됩니다.
        Bank2 bank00 = new Bank2();
        System.out.println(bank00.getAccountNum());      // 결과값 : 0
        System.out.println(bank00.getAccountHolder());   // 결과값 : null
        System.out.println(bank00.getBalance());         // 결과값 : 0
        System.out.println(bank00.getPinNumber());       // 결과값 : 0

    }
}
