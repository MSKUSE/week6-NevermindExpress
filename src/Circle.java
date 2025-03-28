public class Circle extends Shape {

    private int radius;

    public Circle(Point center, int radius) {
        super(center);
        this.radius = radius;
    }

    public Point getCenter() {
        return this.getLocation();
    }

    public void setCenter(Point center) {
        this.setLocation(center);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0){
            this.radius = 0;
            System.out.println("Radius can't be negative");
        }else {
            this.radius = radius;

        }
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + getLocation() +
                ", radius=" + radius +
                '}';
    }
}
