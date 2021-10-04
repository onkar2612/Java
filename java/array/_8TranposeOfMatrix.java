import java.util.*;

public class _8TranposeOfMatrix {
    
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

        int[][] arr2= new int[c][r];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr2[j][i]=arr1[i][j];
            }
        }
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
