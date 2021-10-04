import java.util.Scanner;

public class CircumferenceOfCircle {
    public static double circumference(Double r){
        double circum = 2*3.14*r;
        return circum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radious of circle: ");
        double R=sc.nextDouble();
        System.out.println("Circumference of circle is "+circumference(R));
    }
}
