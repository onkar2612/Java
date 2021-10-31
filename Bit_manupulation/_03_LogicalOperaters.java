import java.beans.Statement;

public class _03_LogicalOperaters {
    public static void main(String[] args) {
        int a=30,b=20,c=10;

        // 1.And Operater(&&)
        System.out.println((a>b)&&(b>c));//Both are true
        System.out.println((a<b)&&(b<c));// Both are false
        System.out.println((a<b)&&(b>c));//One is false and another is true
        // and Operater print true if all the given statements are true
        // and Operater print false if one of the statements is false from given statements

        System.out.println();
        // 2.Or Operater(||)
        System.out.println((a>b)||(b>c));//Both are true
        System.out.println((a<b)||(b<c));// Both are false
        System.out.println((a<b)||(b>c));//One is false and another is true
        // Or Operater print true if one of the statements is true
        // Or Operater print false if All the statements are false statements

        System.out.println();
        // 3.Not Operater(!)
        System.out.println(!(b>c));//This is true
        System.out.println(!(b<c));//This is false
        // Not Operater makes true statements to false AND
        // False Statements to true 
        

}
}