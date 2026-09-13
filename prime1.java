public class prime1 {
    public static void main(String[] args) {
        int a=2;
        if(isprime(a)){
             System.out.println(a + " is a prime number.");
        } else {
            System.out.println(a + " is NOT a prime number.");
        }
        

    }
public static boolean isprime(int n){
    if(n<=0){
        return false;
    }
for(int i=2;i*i<=n;i++){
    if(n%i==0){
        return false;
    }

}
return true;
}
}
