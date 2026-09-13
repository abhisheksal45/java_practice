package Lec04_class_obj.Project;

public class CurrentBalance extends Account implements Transaction {
double overdraftlimit;
    CurrentBalance(double accountnumber,String accountholdername, double balance){
        super( accountnumber, accountholdername, balance);
        this.overdraftlimit=overdraftlimit;
    }




    @Override
    public void deposite(double amount) {
        if(amount>0){
            balance=balance+amount;
            System.out.println("money successfully deposited");
        }
        else {
            System.out.println("Enter Amount greater than 0");
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount>0 && amount<=(balance+overdraftlimit)){
            balance=balance-amount;
            System.out.println("Amount successfully deposited");
    }
else {
    System.out.println("Enter appropriate Amount");
        }

    }

    @Override
    public void displayBalance() {
        System.out.println(" Saving Account balance is "+balance);
    }
    @Override
    public void displayAccountDetails() {
        System.out.println("Account number "+getAccountnumber());
        System.out.println("Account Holder Name "+getAccountholdername());
        System.out.println("over draftlimit "+overdraftlimit);
        System.out.println("Current Balance "+balance);


    }
}
