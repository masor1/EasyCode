package javap.start;

abstract public class Figure {

    private final FigureType type;
    protected final double[] sides;

    protected Figure(FigureType type, double[] sides) {
        this.type = type;
        this.sides = sides;
    }

    protected FigureType getType(){
        return type;
    }

    protected abstract double getArea();

    protected double getPerimeter() {
        double perimeter = 0;
        for (double side : sides) {
            perimeter += side;
        }
        return perimeter;
    }

    @Override
    public String toString() {
        return getType() + " - area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
