package opp.parcial2.shapes;

public class Circle extends Shape {

    private int radio;

    public Circle(int radio){
        super("Círculo", 4);
        this.radio = radio;
    }

    public double getPerimeter(){
        return Math.PI * radio * 2;
    }

    public double getArea(){
        return Math.PI * Math.pow(radio,2);
    }

    public String toString(){
        return "○";
    }
}
