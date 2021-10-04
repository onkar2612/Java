public class _1printI{
    public static void printnTo0(int n){
        if(n==0){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printnTo0(n-1);
    }


    public static void printnTon1(int n,int n1){
        if(n==n1){

            System.out.print(n+" ");
            return;
        }

        System.out.print(n+" ");

        printnTon1(n+1, n1);
    }


    public static void main(String[] args) {
        
        printnTo0(10);
        System.out.println();
        printnTon1(0, 10);
    }
}