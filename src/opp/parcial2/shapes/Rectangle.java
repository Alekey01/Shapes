package opp.parcial2.shapes;

public class Rectangle extends Shape{

    private int base;
    private int height;

    public Rectangle(int base, int height) {
        super("Rectangle", 4);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2*base + 2*height;
    }

    @Override
    public double getArea() {
        return base * height;
    }

    public String toString(){
        return "█";
    }
}
