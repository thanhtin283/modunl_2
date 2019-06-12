import java.awt.*;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){

    }
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(double height, String color, int radius){
        super(color, radius);
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(){
        this.height =height;
    }
    public double getArea(){
        return 2*Math.PI*getRadius()*(getRadius()+getHeight());
    }
    public double getVolume(){
        return Math.pow(super.getRadius(),2)*Math.PI*getHeight();
    }
    @Override
    public String toString(){
        return " Cylinder "
                + "_Color: "
                +getColor()
                +"_Radius: "
                +getRadius()
                +"-Height: "
                +getHeight()
                +"_Volume: "
                +getVolume();
    }
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder(5,"red",6);
        System.out.println(cylinder);
    }
}
