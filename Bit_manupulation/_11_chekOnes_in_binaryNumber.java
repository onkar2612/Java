import java.util.*;
public class _11_chekOnes_in_binaryNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;        
        while(n!=0){
            int ones = (n&1);
            if(ones != 0){
                count++;
            }
            n=n>>1;
        }

        System.out.println(count);
    }
}