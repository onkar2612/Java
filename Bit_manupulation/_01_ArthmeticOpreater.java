public class _01_ArthmeticOpreater{

public static void main(String[] args) {

    int A=10;

    // Increment
    // 1. Preincrement
    // First Assign value of A in c and THen Increment a value of A 
    int c = A++;
    System.out.println(A);
    System.out.println(c);

    A=10;

    // 2. Post Increment
    // First Increment value of A and THen Assign a value of A in c
    int d = ++A;
    System.out.println(A);
    System.out.println(d);

     A=10;

    // Decrement
    // 1. PreDecrement
    // First Assign value of A in c and THen Decrement a value of A 
    c = A--;
    System.out.println(A);
    System.out.println(c);

    A=10;

    // 2. Post Decrement
    // First Decrement value of A and THen Assign a value of A in c
    d = --A;
    System.out.println(A);
    System.out.println(d);

    
}  
    
}