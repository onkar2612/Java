public class functionToCheckEvenOrOdd {
    public static void evenOrOdd(int n) {
        if(n<0){
            System.out.println("Envalid input");
            return;
        }
        else if(n%2==0){
            System.out.println(n+" Is even number");
        }
        else if(n%2==1){
            System.out.println(n+" Is odd number");
        }
    }

    public static void main(String[] args) {
        evenOrOdd(10);
        evenOrOdd(-5);
        evenOrOdd(3);
    }
}
