package Shape;

public class Triangle extends Shape{

    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getArea() {
        return Math.sqrt(getP()*(getP()-side1)*(getP()-side2)*(getP()-side3));
    }

    public double getPerimeter() {
        return side1+side2+side3;
    }

    public double getP() {
        return getPerimeter()/2;
    }

    public String toString() {
        return "This triangle has 3 side: ("+side1+", "+side2+", "+side3+")" +"\n"+"color is: "+getColor()+"\n"+"perimeter is: "+getPerimeter()+", area is: "+getArea();
    }

}
