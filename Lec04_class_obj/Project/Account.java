package Lec04_class_obj.Project;

public abstract class Account {
    private double accountnumber;
    private String accountholdername;
    protected double balance;

    Account(double accountnumber,String accountholdername, double balance){
        this.accountnumber=accountnumber;
        this.accountholdername=accountholdername;
        this.balance=balance;

    }

    public double getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(double accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccountholdername() {
        return accountholdername;
    }

    public void setAccountholdername(String accountholdername) {
        this.accountholdername = accountholdername;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
public abstract void displayAccountDetails();
}
