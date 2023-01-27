import java.util.Scanner;
public class PosNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        if ( n > 0 ){
            System.out.println("N is Positive");
        }
        else if ( n < 0 ){
            System.out.println("N is Negative");
        }
        else {
            System.out.println("N is Zero");
        }
    }
    
}
