import java.util.Scanner;
public class hienthi20songuyento {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập số lượng số nguyên tố cần in ra: ");
            int number = input.nextInt();
            int count = 0;
            int n = 2;
            System.out.println(number + " số nguyên tố đầu tiên là: ");
            while (count < number){
                if (Prime(n)){
                    System.out.println(n);
                    count++;
                }
                n++;
            }
        }
        public static boolean Prime(int number) {
            boolean flag = true;
            if (number < 2) {
                flag = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        flag = false;
                        break;
                    }
                }
            }
            return flag;
        }
    }
