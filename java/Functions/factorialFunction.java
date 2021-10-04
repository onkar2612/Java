import java.util.*;

public class factorialFunction{

    public static void printFactorial(int n){
        int fact=1;
        if(n<0){
            System.out.println("Invalid Syntax");
            return;
        }
        for(int i=n;i>=1;i--){
            fact = fact * i;
        }
        System.out.println(fact);
        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");        
        int n = sc.nextInt();
        printFactorial(n);
    }
}