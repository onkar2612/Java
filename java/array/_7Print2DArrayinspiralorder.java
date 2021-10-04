import java.util.*;

public class _7Print2DArrayinspiralorder {
   
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


        int left=0;
        int right=c-1;
        int top=0;
        int bottom=r-1;
        

        while(top<=bottom && left<=right){

        for(int i=left;i<=right;i++){
            System.out.print(arr1[top][i]+" ");
        }
        top+=1;
        System.out.println();
        
        for(int i=top;i<=bottom;i++){
            System.out.print(arr1[i][right]+" ");
        }
        right-=1;
        System.out.println();


        for(int i=right;i>=left;i--){
            System.out.print(arr1[bottom][i]+" ");
        }
        bottom-=1;
        System.out.println();


        for(int i=bottom;i>=top;i--){
            System.out.print(arr1[i][left]+" ");
        }
        left+=1;
        System.out.println();
    }

    }
}
