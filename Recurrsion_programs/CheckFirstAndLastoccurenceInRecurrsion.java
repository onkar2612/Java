import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class CheckFirstAndLastoccurenceInRecurrsion {
    public static int first = -1;
    public static int last = -1;

    public static void CheckOccurence(String str,int idx,char a){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char  currchar = str.charAt(idx);

        if(currchar==a){
            if(first==-1){
                first=idx;
            }else{
                last=idx;
            }

        }
        CheckOccurence(str, idx+1, a);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str=sc.next();

        CheckOccurence(str, 0, 'a');




    }
    
}
