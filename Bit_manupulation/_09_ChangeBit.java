import java.security.PolicySpi;
import java.util.Scanner;

public class _09_ChangeBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=10;
        int pos = 0;
        int mask = 1<<pos;
        System.out.println(mask^n);
    }
    
}
