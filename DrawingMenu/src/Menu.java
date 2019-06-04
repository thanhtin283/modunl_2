public class Menu {
    public static void main(String[] args){
        int choice = -1;
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (choice !=0){
            System.out.println("menu");
            System.out.println("1. vẽ hình tam giác ");
            System.out.println("2. vẽ hình vuông");
            System.out.println("3. vẽ hình chữ nhật");
            System.out.println("0. Exit");
            System.out.println(" Enter you choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("vẽ hình tam giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("vẽ hình vuông");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    System.out.println("* * * * *");
                    break;
                case 3:
                    System.out.println("vẽ hình chữ nhật");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println(" NO choice! ");
            }
        }
    }
}
