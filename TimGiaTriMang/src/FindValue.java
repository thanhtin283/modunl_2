public class FindValue {
    public static void main(String[] args) {
        System.out.println("The application searches for values in an array");

        String[] students = {"tin", "Tai", "Phun", "Ducanh", "Bon", "San", "Hoang", "DUc", "Zoe", "Emily"};

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("nhập tên học sinh: ");
        String input_name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí của học sinh trong danh sách " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (isExist == false)
            System.out.println("không tìm thấy " + input_name + " trong danh sách.");
    }

}