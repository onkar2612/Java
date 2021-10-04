import java.util.Scanner;

public class _2CheckMinMaxInArray {
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
        int max=0;
        int min=0;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i]>arr[j]){
                    max=arr[i];
                }
                if(arr[j]<arr[i]){
                    min=arr[j];
                }
                
                
            }
        }
       

        System.out.println(max);
        System.out.println(min);

    }
    
}
