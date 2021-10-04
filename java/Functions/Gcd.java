import java.util.Scanner;

public class Gcd {
    public static int calculateGcd(int n,int n1){
        int ans = 0;
        for(int i=n1;i>=1;i--){
            if(n % i == 0 && n1 % i == 0){
                ans = i;
                break;            }
        }
        return ans;
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("gcd of "+a+" and "+b+" is "+calculateGcd(a, b));
    }
}
