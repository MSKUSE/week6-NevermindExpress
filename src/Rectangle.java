public class Rectangle extends Shape {

    private int sideA , sideB;

    public Rectangle(Point topLeft, int sideA, int sideB) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideB);
    }

    public Rectangle(Point topLeft, int sideA) {
        super(topLeft);
        setSideA(sideA);
        setSideB(sideA);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            this.sideA = 0;
            System.out.println("Side A can't be negative!!");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }
    @Override
    public double perimeter(){
        return 2 * (sideA + sideB);
    }
    @Override
    public double area(){
        return sideA * sideB;
    }

    @Override
    public String toString() {
       return "Rectangle{" +
//                "topLeft=" + topLeft +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
