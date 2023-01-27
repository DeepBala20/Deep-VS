import java.util.Scanner;
public class Metretofeet{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Meter");
		int m = sc.nextInt();
		double feet = 3.14*m;
		System.out.println("feet = "+feet);

	}
}