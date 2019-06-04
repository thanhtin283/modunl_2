import java.util.Scanner;
public class nam {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double a,b,c;
    System.out.print("a :");
    a = scanner.nextDouble();
    System.out.print("b :");
    b = scanner.nextDouble();
    System.out.print("c :");
    c = scanner.nextDouble();

    if (a !=0){
        double answer =(c-b)/a;
        System.out.printf("Equation pass with x = %f!\n", answer);
    }else
        if (b==0){
        System.out.printf("The solution is all x!");
    }else {
        System.out.printf("No solution!");
        }
    }
}
