import java.util.*;
public class _6PrintIndicesOfin2Darray {
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
        System.out.println("Enter a number to search: ");
        int n=sc.nextInt();
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               if(arr1[i][j]==n){
                   System.out.println(i+" "+j);
               }
            }
            System.out.println();
        }



    }
    
}
