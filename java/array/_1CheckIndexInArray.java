import java.util.Scanner;

public class _1CheckIndexInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Enter elements of array: ");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to check index: ");
        int check = sc.nextInt();

        for(int i=0;i<size;i++){
            if(arr[i]==check){
                System.out.println(i);
            }
        }

    }
    
}
