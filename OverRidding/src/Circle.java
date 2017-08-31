public class Circle {
    double radius;
    String color;

    public Circle(double radius,String color){
        this.color = color;
        this.radius = radius;
    }

    public Circle(){
        radius = 1.0;
        color = "Rad";
    }

    public double geArea(){
        return Math.PI*radius*radius;
    }
}
