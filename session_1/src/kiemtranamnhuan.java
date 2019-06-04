import java.util.Scanner;

public class kiemtranamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("nhập số năm :");
        year = scanner.nextInt();
        boolean isLeapyear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapyear = true;
                }
            } else {
                isLeapyear = true;
            }
        }
        if (isLeapyear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
