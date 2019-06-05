import java.util.Scanner;
public class tiente {
        public static void main(String[] args) {
            double vnd = 23000;
            double usd;
            Scanner Scanner = new Scanner (System.in);
            System.out.print("nhập số tiền USD: ");
            usd = Scanner.nextDouble();
            double quydoi = usd * 23000;
            System.out.print("Gía trị VND:" + quydoi);
        }
    }
