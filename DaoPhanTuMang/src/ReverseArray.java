public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("The application reverses the element of the array");

        int size;
        int[] array;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        do {
            System.out.print("nhập độ dài mảng: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("độ dài mảng không quá 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("nhập phần tử " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "các phần tử trong mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // array reverse
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.println();
        System.out.printf("%-20s%s", "mảng được đảo ngược là : ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}