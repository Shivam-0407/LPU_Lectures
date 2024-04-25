package Abstraction.Data_Hiding;

public class Account extends Access_Modifiers {
   public  int account_no; // data hiding  // 3211
   public float balance;

    public int getAccount_no() {
        return account_no;
    }

    public void display(){
        System.out.println("Hello !! Welcome to XYZ branch");
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}

// encapsulation = data_hiding+abstraction
