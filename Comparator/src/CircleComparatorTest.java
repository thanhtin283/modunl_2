import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles =new Circle[3];
        circles[0]=new Circle(3.5);
        circles[1]=new Circle();
        circles[2]=new Circle(3.5,"indego",false);

        System.out.println("Pre-sorted: ");
        for (int i=0;i<circles.length;i++){
            System.out.println(circles[i]);
        }
        Comparator circleCompartor = new CircleComparator();
        Arrays.sort(circles, circleCompartor);

        System.out.println("After-sorted:");
        for (int i=0;i<circles.length;i++){
            System.out.println(circles[i]);
        }
    }
}
