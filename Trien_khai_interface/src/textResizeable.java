import Geometric.Circle;
import Geometric.Rectangle;
import Geometric.Shape;
import Resize.Resizeable;

public class textResizeable {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        for (int i=0;i<shapes.length;i++){
            System.out.println(shapes[i]);
        }
        Resizeable resizeable1 = (Circle) shapes[0];
        Resizeable resizeable2 = (Rectangle) shapes[1];
        resizeable1.resize(10);
        resizeable2.resize(10);
        System.out.println(resizeable1);
        System.out.println(resizeable2);
    }
}
