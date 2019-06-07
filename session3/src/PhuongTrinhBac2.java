import java.util.Scanner;

public class PhuongTrinhBac2 {
    double a, b, c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public double getRoot2() {
        return ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập a : ");
        double a = scanner.nextDouble();
        System.out.print("nhập b : ");
        double b = scanner.nextDouble();
        System.out.print("nhập c : ");
        double c = scanner.nextDouble();
        PhuongTrinhBac2 phuongTrinhBac2 = new PhuongTrinhBac2(a, b, c);
        if (phuongTrinhBac2.delta() > 0) {
            System.out.print("phương trình có 2 nghiệm: " + phuongTrinhBac2.getRoot1() + "và" + phuongTrinhBac2.getRoot2());
        } else if (phuongTrinhBac2.delta() == 0) {
            System.out.print("Phương trình có 1 nghiêm: " + phuongTrinhBac2.getRoot1());
        } else {
            System.out.print("Phương trình vô nghiệm");
        }
    }
}
