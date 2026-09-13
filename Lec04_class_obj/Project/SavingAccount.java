package Lec04_class_obj.Project;

public class SavingAccount extends Account implements Transaction

{

    SavingAccount(double accountnumber, String accountholdername, double balance) {
        super(accountnumber, accountholdername, balance);
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
if(amount>0 && amount<=balance){
    balance=balance-amount;
    System.out.println("Amount successfully deposited");

}
  else{
      System.out.println("Please enter appropriate amount");
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
        System.out.println("Account number "+getAccountholdername());
        System.out.println("Current Balance "+balance);




    }
}
