import java.awt.geom.Area;

public class Circle {
    private int radius;
    private String color ="red";

    public Circle(){
    }
    public Circle(String color, int radius){
        this.color=color;
        this.radius=radius;
    }
    public String getColor(){
        return color;
    }

    public int getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius){
        this.radius =radius;
    }

    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    @Override
    public String toString(){
        return "Circle: - color: "
                + getColor()
                + "- radius: "
                + getRadius()
                + "_Area"
                + getArea();
    }
    public static void main(String[] args){
        Circle circle = new Circle("blue",5);
        System.out.println(circle);
    }
}
