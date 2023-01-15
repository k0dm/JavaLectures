package lecture20;

import lecture21.Figure;
import lecture24.FigureType;

public class Rectangle extends Figure {

    public Rectangle(Point a, Point b, Point c, Point d){
        this(a.getDistanceTo(b), b.getDistanceTo(c), c.getDistanceTo(d),d.getDistanceTo(a));
    }

    public Rectangle(double sideA, double sideB, double sideC, double sideD){
        super( new double[] {sideA, sideB, sideC, sideD}, FigureType.RECTANGLE);
    }


    @Override
    protected double getArea() {
        return sides[0]*sides[2];
    }
}









































