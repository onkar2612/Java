import java.util.Scanner;

public class ReverseString {

    public static void Reverse(String str,int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        Reverse(str, idx-1);
    }
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();

        Reverse(str1,str1.length()-1);
    }
    
}
