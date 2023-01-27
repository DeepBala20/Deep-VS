import java.util.Scanner;
public class Diameter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Area Of Circle");
        double area = sc.nextDouble();
        double r = Math.sqrt(area/3.14) ;
        double d = 2 * r ;
        System.out.println("Diameter is = "+d);   
    }

}