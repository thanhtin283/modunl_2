public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle>{
    public ComparableCircle(){

    }
    public ComparableCircle(double raduis){
        super(raduis);
    }
    public ComparableCircle(double raduis, String color, boolean filled){
        super(raduis, color,filled);
    }
    @Override
    public int compareTo(ComparableCircle o){
        if (getRadius()>o.getRadius())return 1;
        else if (getRadius()<o.getRadius())return -1;
        else return 1;
    }

}
