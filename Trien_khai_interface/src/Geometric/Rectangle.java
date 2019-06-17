package Geometric;
import Resize.*;

public class Rectangle extends Shape implements Resizeable{
    private double width =1.0;
    private double lenght =1.0;

    public Rectangle(){
    }

    public Rectangle(double width, double lenght){
        this.width= width;
        this.lenght = lenght;
    }
    public Rectangle(double width, double lenght, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLenght(){
        return lenght;
    }
    public void setLenght(double lenght){
        this.lenght = lenght;
    }
    public double getArea(){
        return width * this.lenght;
    }
    public double getPerimeter(){
        return 2*(width + this.lenght);
    }
    @Override
    public String toString(){
        return "Hình chữ nhật có width ="
                + getWidth()
                + "and lenght ="
                +getLenght()
                +", đó là một lớp con của"
                + super.toString();
    }
    @Override
    public void resize(double percent){
        this.lenght+=(this.lenght *percent /100);
        this.width+=(this.width * percent/100);
    }
    public static void main(String[] args){
        Rectangle rectangle =new Rectangle();
        System.out.println(rectangle);

        rectangle =new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
