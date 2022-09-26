public class Circle extends Shape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double Area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Area Circle: " + Area();

    }

}
