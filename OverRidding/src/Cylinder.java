public class Cylinder extends Circle {
    double height;

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    @Override
    public double geArea() {
        return 2*Math.PI*radius*height+2*super.geArea();
    }

    public double getVolume(){

        return super.geArea()*height;
    }
}
