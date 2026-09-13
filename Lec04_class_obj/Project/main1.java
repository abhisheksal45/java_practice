package Lec04_class_obj.Project;

public class main1 {
    public static void main(String[] args) {
        CurrentBalance ac=new CurrentBalance(1234567,"joshep",2345678) ;
          SavingAccount ab=new SavingAccount(12345656,"babulal",45432434) ;

          ac.deposite(600);
          ac.withdraw(122);
          ac.displayAccountDetails();
          ac.displayBalance();
System.out.println();
        ab.deposite(600);
        ab.withdraw(122);
        ab.displayAccountDetails();
        ab.displayBalance();

        }
    }

