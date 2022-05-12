package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        double result = sideA * sideB;
        double scale = Math.pow(10, 1);
        return Math.ceil(result * scale) / scale;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq.units, sideA: "
                + sideA + " units, sideB: "
                + sideB + " units, color: "
                + getColor());
    }
}