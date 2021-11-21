package start;

import java.util.Arrays;

public class FigureFactory {
    public Figure create(double... sides) {
        switch (sides.length) {
            case 1:
                return new Circle(sides[0]);
            case 2:
                return new Rectangle(sides[0], sides[1]);
            case 3:
                return new Triangle(sides[0], sides[1], sides[2]);
            default:
                throw new IllegalArgumentException("can't create object with arguments " + Arrays.toString(sides));
        }
    }
}
