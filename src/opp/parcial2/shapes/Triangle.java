package opp.parcial2.shapes;

public class Triangle extends Shape{

    private int base;
    private int height;

    public Triangle(int base, int height){
        super("Triángulo", 3);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 3 * base ;
    }

    @Override
    public double getArea() {
        return (base*height)/2.0;
    }

    public String toString(){
        return "▲";
    }
}
