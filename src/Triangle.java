public class Triangle extends Shape {

    private int sA,sB,sC;

    public Triangle(Point location) {
        super(location);
    }

    public Triangle(Point location, int sA, int sB, int sC) {
        super(location);
        this.sA = sA;
        this.sB = sB;
        this.sC = sC;
    }

    public int getsA() {
        return sA;
    }

    public void setsA(int sA) {
        this.sA = sA;
    }

    public int getsB() {
        return sB;
    }

    public void setsB(int sB) {
        this.sB = sB;
    }

    public int getsC() {
        return sC;
    }

    public void setsC(int sC) {
        this.sC = sC;
    }

    @Override
    public double area() {
        return (double) (sA * sB) /2;
    }

    @Override
    public double perimeter() {
        return sA+sB+sC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sA=" + sA +
                ", sB=" + sB +
                ", sC=" + sC +
                '}';
    }
}
