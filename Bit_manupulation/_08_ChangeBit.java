import java.util.*;


public class _08_ChangeBit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int pos = 1;
        int oper = sc.nextInt();
        int mask = 1<<pos;
        if(oper == 1){
            System.out.println(mask | n);
        }else{
            System.out.println(~(mask)&n);
        }
    }
}