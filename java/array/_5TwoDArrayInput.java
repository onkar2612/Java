import java.util.*;
public class _5TwoDArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] arr1=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }



    }
    
}
