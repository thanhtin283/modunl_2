public class Circle extends shape{
    private double radius =1.0;

    public Circle(){

    }
    public  Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius =radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(){
        this.radius=radius;
    }
    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "Một vòng tròn có bán kính= "
                + getRadius()+", đó là một lớp con của "
                + super.toString();
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

    }
}
