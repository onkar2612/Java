import java.util.*;

public class _4CheckSortedArrayInRecurssion {
    public static boolean CheckSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]>=arr[idx+1]){
           return false;
        }else{
            return CheckSorted(arr, idx+1);
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(CheckSorted(arr, 0));
        
    }
    
}
