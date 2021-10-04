import java.util.*;
class xRaisTonUsingRecurssion {

    public static int Raisto(int n,int n1){
        if(n1==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        int xTon=Raisto(n, n1-1);
        int ans = n * xTon;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();

        int pow = Raisto(n, n1);
        System.out.println(pow);
    }    
}