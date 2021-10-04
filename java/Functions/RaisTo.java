import java.util.Scanner;

public class RaisTo{

    public static int Raisto(int n,int n1){
        int i = 0;
        for(int j=1;j<=n1;j++){
            i+=1;
           
        }
        // System.out.println(i);
        int rto=n;
        // int to=n;
        for(int j=1;j<i;j++){            
           rto*=n;
        }
        return rto;

    }
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        int n = sc.nextInt();
        int n1 = sc.nextInt();        
        System.out.println("Answer is "+Raisto(n, n1));
    }    
}