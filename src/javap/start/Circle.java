package javap.start;

public class Circle extends Figure{

    protected Circle(double radius) {
        super(FigureType.CIRCLE, new double[]{radius});
    }

    @Override
    public double getArea() {
        return 3.14 * sides[0] * sides[0];
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * sides[0];
    }
}
