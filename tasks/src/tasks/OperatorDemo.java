package tasks;

public class OperatorDemo {
    public static void main(String[] args) {
        
        int a = 5;
        int b = a++; 
        int c = ++a; 

        System.out.println("Post-increment (b = a++): b = " + b + ", a = " + a);
        System.out.println("Pre-increment (c = ++a): c = " + c + ", a = " + a);

        
        int x = 8;  
        int leftShift = x << 2;  
        int rightShift = x >> 2; 

        System.out.println("\nOriginal x = " + x);
        System.out.println("x << 2 (Left Shift) = " + leftShift);
        System.out.println("x >> 2 (Right Shift) = " + rightShift);

        
        int p = 5;
        int q = 10;

        
        System.out.println("\nLogical AND (&&):");
        if (p < q && ++p < 10) {
            System.out.println("Condition true with p = " + p);
        } else {
            System.out.println("Condition false with p = " + p);
        }

        
        p = 5; 
        System.out.println("\nBitwise AND (&):");
        if (p < q & ++p < 10) {
            System.out.println("Condition true with p = " + p);
        } else {
            System.out.println("Condition false with p = " + p);
        }
    }
}


