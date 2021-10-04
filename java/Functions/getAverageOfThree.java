import java.util.Scanner;

public class getAverageOfThree {
    public static int average(int n,int n1,int n2){
        int sum = n+n1+n2;
        int aveR = sum/3;
        return aveR;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Average of given numbers is "+average(a,b,c));
        
    }
}
