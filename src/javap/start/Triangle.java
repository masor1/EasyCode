package javap.start;

public class Triangle extends Figure {

    protected Triangle(double a, double b, double c) {
        super(FigureType.TRIANGLE, new double[]{a, b, c});
    }

    @Override
    public double getArea() {
        double p = super.getPerimeter() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }
}
