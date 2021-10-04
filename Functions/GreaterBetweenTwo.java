import java.util.*;

public class GreaterBetweenTwo {
    public static int bigBetweenTwo(int n,int n1){
        if(n>n1){
            return n;
        }else{
            return n1;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greatest number between these two numbers is "+bigBetweenTwo(a, b));
    }
}
