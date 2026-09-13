package Lec04_class_obj;

public class BankAccount1 {

        private double balance ;

        public double getBalance() {
            return balance;
        }
        public void setBalance(double balance){
                this.balance=balance;
            }


          public double deposite(double amt){
            double sum;
            sum=balance+amt;
            return sum;
          }

          public double withdraw(double amt){
            double res;
            res=balance-amt;
            return res;
          }


}


