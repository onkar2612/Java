import java.util.*;
public class _10_isPowerof2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = (n & (n-1));
        if(mask == 0){
            System.out.println(n + " is power of 2");
        }else{
            System.out.println(n + " Is not power of 2");
        }
        
    }
    
}
