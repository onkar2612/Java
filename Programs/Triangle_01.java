import java.util.Scanner;

public class Triangle_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of triangle: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }else if((i+j)%2==1){
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
