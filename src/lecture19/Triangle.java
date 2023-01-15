package lecture19;

import lecture20.Point;
import lecture21.Figure;
import lecture24.FigureType;

public class Triangle extends Figure {


    public Triangle(Point a, Point b, Point c){
       this( a.getDistanceTo(b),a.getDistanceTo(c), b.getDistanceTo(c));
    }
    public Triangle(double sideA, double sideB, double sideC ){
        super(new double[] { sideA, sideB, sideC}, FigureType.TRIANGLE);

    }

    public boolean isRightTriangle() {
        double a2 = sides[0] * sides[0];
        double b2 = sides[1] * sides[1];
        double c2 = sides[2] * sides[2];

        return a2 + b2 == c2 ||
                a2 + c2 == b2 ||
                b2 + c2 == a2;

    }


    @Override
    protected double getArea() {
        double p = (sides[0] + sides[1] + sides[2]) / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }
}
