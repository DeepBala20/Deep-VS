import java.util.Scanner;
public class Bmi{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter height in inches");
        double h = sc.nextInt();
        System.out.println("Enter Weight in Pound");
        double w = sc.nextInt();
        double weight = w*(0.45359237);
        double height = h*(0.0254);
        double bmi = weight/(height*height);
        System.out.println("BMI = "+ bmi);

    }
}
