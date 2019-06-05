import java.util.Scanner;
public class cacsonguyentonhohon100 {
        public static void main(String[] args) {
            System.out.println("hiển thị các số nguyên tố từ 0 đến 100");
            for (int i = 0; i <= 100; i++) {
                if (Prime(i)) {
                    System.out.println(i );
                }
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
