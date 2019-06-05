public class FindLargestValue {
    public static void main(String[] args) {
        System.out.println("The application finds the largest value in the array.");

        int size;
        int[] array;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        do {
            System.out.print("nhập độ dài mảng: ");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("độ dài không vượt quá 10 phần tử");
        } while (size > 10);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhập phần tử mảng " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("danh sách : ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("giá trị lớn nhất trong mảng là: " + max + " ,ở vị trí " + index);
    }
}