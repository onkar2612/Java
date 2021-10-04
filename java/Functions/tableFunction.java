public class tableFunction {
    public static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);

        }
    }

    public static void main(String[] args) {
        table(2);
        table(6);
        table(15);
        table(-5);
    }
}
