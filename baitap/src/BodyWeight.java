import java.util.Scanner;
public class BodyWeight {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double weight,height,bim;
        System.out.print("you weight (in kilogam): ");
        weight= scanner.nextDouble();
        System.out.print("you height (in meter) :");
        height=scanner.nextDouble();

        bim = weight/Math.pow(height,2);
        System.out.printf("%-20.2s%s",bim,"Interpretation\n");

        if (bim<18)
            System.out.printf("%-20f%s",bim,"UnderWeight");
        else if (bim<25.0)
            System.out.printf("%-20.2f%s",bim,"Normal");
        else  if (bim<30.0)
            System.out.printf("%-20.2f%s",bim,"OverWeight");
    }
}
