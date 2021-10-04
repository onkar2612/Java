import java.util.Scanner;

public class CheckFirstAndLastoccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int size=str.length();

        for(int i=0;i<size;i++){
            if(str.charAt(i)=='a'){
                System.out.println(i);
                break;
            }
        }

        for(int i=size-1;i>=0;i--){
            if(str.charAt(i)=='a'){
                System.out.println(i);
                break;
            }
        }



        
    }  
    
}

