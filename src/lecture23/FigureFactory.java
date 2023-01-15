package lecture23;

import lecture19.Triangle;
import lecture20.Rectangle;
import lecture21.Figure;

public class FigureFactory {

    public Figure create(int... sides) {
        int numOfSides = sides.length;
        return switch (numOfSides) {
            case 3 -> new Triangle(sides[0], sides[1], sides[2]);
            case 4 -> new Rectangle(sides[0], sides[1], sides[2], sides[3]);
            default -> throw new IllegalArgumentException("no figure with " + numOfSides + " sides");
        };
    }
}
