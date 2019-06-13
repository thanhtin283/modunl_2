import java.util.Scanner;

public class Shape {
    private static final String STRING_EMMPY = "";
    private static final String STRING_STAR = " * ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // print rectangle
        System.out.println("hinh chữ nhật");
        System.out.println("nhập chiều dài : ");
        int width = scanner.nextInt();

        System.out.println("nhập chiều rộng : ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(STRING_STAR);
            }
            System.out.println(STRING_EMMPY);
        }
        // print triangle
        System.out.println("hình tam giác");
        System.out.println("nhập chiều dài: ");
        int widthTriangle = scanner.nextInt();

        System.out.println("nhập chiều cao : ");
        int heightTriangle = scanner.nextInt();

        for (int i = 0; i < heightTriangle; i++) {
            for (int j = 0; j < widthTriangle; j++) {
                System.out.print(STRING_STAR);
                if (i == j) break;
            }
            System.out.println(STRING_EMMPY);
        }
    }
}
