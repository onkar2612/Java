public class _05_GetBit{
    public static void main(String[]argu){
        int n = 5;
        int pos = 3;
        int mask = 1<<pos;
        if((mask & n)==0){
            System.out.println("Bit is Zero");
        }       
        else{
            System.out.println("Bit is One");
        }       
    }
}