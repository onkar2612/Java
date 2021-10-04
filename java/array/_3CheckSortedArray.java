import java.util.Scanner;

public class _3CheckSortedArray {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       int a=0;

        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){                
                if(arr[i]<arr[j]){
                   a=1;
                }            
                else if(arr[i]>arr[j]){
                   a=2;
                }    
                else{
                    a=0;
                    break;
                }        
                
            }
        }
        if(a==1){
            System.out.println("Sorted in Ascending order");
        }
        else if(a==2){
            System.out.println("Sorted in Descending order");
        }
       
        else{
            System.out.println(" Not Sorted");
        }
       

        // System.out.println(max);
        // System.out.println(min);

    }
    
}
