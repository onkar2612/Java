public class _12_DtoBandBtoD {
    public static StringBuilder DtoB(int n){
        String bin="";
        while(n!=0){
            int rem = (n&1);
            if(rem==0){
                bin = bin + "0";
            }else{
                bin = bin+1;
            }
            n=n>>1;
        }
        StringBuilder bin1 = new StringBuilder();
        bin1.append(bin);
        bin1.reverse();
        return bin1;
    }

    public static double BtoD(int n){
        double i = 0;
        double ans=0;
        while(n!=0){
            double rem = n%10;
            ans = ans + (rem * Math.pow(2, i));           
            n/=10;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(DtoB(100));
        System.out.println(BtoD(1100010010));
        
    }
    
}
