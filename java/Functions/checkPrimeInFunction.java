public class checkPrimeInFunction {
    public static void isPrime(int n){
        boolean flag = true;
        for(int i=2;i<=(n/2);i++){
            if(n%i==0){
                System.out.println(n+" Is non-prime number");
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(n+" Is prime number");
        }
    }
    public static void main(String[] args) {
        isPrime(9);
        isPrime(10);
        isPrime(13);
        isPrime(17);
        isPrime(93);
        isPrime(118);
    }
}
