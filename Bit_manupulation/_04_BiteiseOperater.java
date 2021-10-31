public class _04_BiteiseOperater {
    public static void main(String[] args) {
        
        int a=30,b=20,c=10;


        // All Bitwise operaters mostly use for binary numbers which are in 0's and 1's 
        // 0 means false and 1 means true 


        // 1.Binary And Operater(&)
        System.out.println((a>b)&(b>c));//Both are true
        System.out.println((a<b)&(b<c));// Both are false
        System.out.println((a<b)&(b>c));//One is false and another is true
        // and Operater print true if all the given statements are true
        // and Operater print false if one of the statements is false or all the statements are false from given statements

        System.out.println();

        // 2.Binary Or Operater(|)
        System.out.println((a>b)|(b>c));//Both are true
        System.out.println((a<b)|(b<c));// Both are false
        System.out.println((a<b)|(b>c));//One is false and another is true
        // Or Operater print true if one of the statements is true or all the statements are true
        // Or Operater print false if All the statements are false statements

        System.out.println();
        // 3.Binary XOR Operater(^)
        System.out.println((a>b)^(b>c));//Both are true
        System.out.println((a<b)^(b<c));// Both are false
        System.out.println((a<b)^(b>c));//One is false and another is true
        // XOr Operater print true if one of the statements is true
        // XOr Operater print false if All the statements are false or All the  statements are true


        System.out.println();
        // 4.Binary one's complenent Operater(~)
        // When we we want complent of number we use complement operater 
        System.out.println(~10);// it means -(10+1)=-11
        System.out.println(~(-10)); // it means -(-10+1)=9

        System.out.println();
        // 4.Binary Left shift Operater(<<)
        // Left shift operater shift operater increase the value of number e.g 10<<1=10*2 and 10<<2=10*4 and 10<<3=10*8
        // for example 
        int num = 10;
        int num1 = num<<4;// it means 10*16
        System.out.println(num1);

        System.out.println();
        // 4.Binary Right shift Operater(<<)
        // Left shift operater shift operater Decrease the value of number e.g 10>>1=10/2 and 10>>2=10/4
        // for example 
        num = 10;
        num1 = num>>4;// it means 10*16 which is 0
        int num2 = num>>2;// it means 10*4 which is 2
        System.out.println(num1);
        System.out.println(num2);

    }
    
}
