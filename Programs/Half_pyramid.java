import java.util.Scanner;

public class Half_pyramid {
    public static void main(String[] args) {
        System.out.print("Enter size of pyramid: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
