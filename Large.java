import java.util.Scanner;
public class Large {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter A , B And C ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int large = ( a > b ) ? ( ( a > c ) ? (a) : (c) ) : ( ( b > c ) ? (b) : (c) ) ;

        System.out.println(" larger among three numbers is "+ large) ;
        

    }
    
}
