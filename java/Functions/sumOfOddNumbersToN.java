import java.util.Scanner;

public class sumOfOddNumbersToN {
    public static int sumOfOddOfn(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of "+n+" Is "+sumOfOddOfn(n));
    }
}
