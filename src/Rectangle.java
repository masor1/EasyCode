public class Rectangle extends Figure {

    protected Rectangle(double a, double b) {
        super(FigureType.RECTANGLE, new double[]{a, b});
    }

    @Override
    public double getArea() {
        return sides[0] * sides[1];
    }

    @Override
    public double getPerimeter() {
        return 2 * super.getPerimeter();
    }
}
