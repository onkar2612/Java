import java.util.Scanner;

public class voteEligilibility {
    public static void isEligible(int n){
        if(n<18){
            System.out.println("youre not eligible for vote");
        }
        else if(n>=18){
            System.out.println("youre eligible for vote");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int n = sc.nextInt();
        isEligible(n);
    }
}
