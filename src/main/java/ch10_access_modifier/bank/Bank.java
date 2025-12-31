package ch10_access_modifier.bank;

public class Bank {
    private int accountNum;
    private String accountHolder;
    private int balance;
    private int pinNumber;

    public Bank() {
    }

    public Bank(int accountNum) {
        this.accountNum = accountNum;
    }

    public Bank(int accountNum, String accountHolder) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
    }

    public Bank(int accountNum, String accountHolder, int balance) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public Bank(int accountNum, String accountHolder, int balance, int pinNumber) {
        this.accountNum = accountNum;
        this.accountHolder = accountHolder;
        this.balance = balance;
        if (pinNumber > -1 && pinNumber < 9999){
            this.pinNumber = pinNumber;
            return;
        }
        System.out.println("불가능한 비밀번호입니다.");
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        boolean checkBalance;
        if (balance < 0) {
            checkBalance = false;
            return;
        } checkBalance = true;
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        if (pinNumber > -1 && pinNumber < 9999) {
            this.pinNumber = pinNumber;
            return;
        }
        System.out.println("불가능한 비밀번호입니다.");
    }

    public void deposit(int amount, int inputPin) {
            if (pinNumber != inputPin) {
                System.out.println("비밀번호가 틀렸습니다.");
                return;
            }
            if (pinNumber == inputPin) {
                if (amount < 0) {
                    System.out.println("불가능한 입력 금액입니다.");
                    return;
                }
                balance += amount;
                System.out.println(amount + "원이 입금되었습니다. 현재 잔액 : " + balance + "원");
            }
    }

    public void withdraw(int amount, int inputPin) {
        if (pinNumber != inputPin) {
            System.out.println("비밀번호가 틀렸습니다.");
            return;
        }
        if (pinNumber == inputPin) {
            if (amount < 0) {
                System.out.println("불가능한 입력 금액입니다.");
                return;
            } else if ((balance - amount) < 0) {
                System.out.println("출금 불가입니다.");
                return;
            }
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액 : " + balance + "원");
        }
    }

    public void showAccountInfo() {
        System.out.println();
        System.out.println("계좌 번호 : " + getAccountNum());
        System.out.println("계좌 소유자 : " + getAccountHolder());
        System.out.println("현재 잔액 : " + getBalance() + "원");
    }
}
