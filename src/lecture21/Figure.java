package lecture21;

import lecture24.FigureType;

public abstract class Figure {

    protected final FigureType type;
    protected final double[] sides;


    protected Figure(double[] sides, FigureType type) {
        this.type = type;
        this.sides = sides;
    }

    protected  double getPerimeter(){
        double perimeter = 0;
        for (double side: sides){
            perimeter += side;
        }
        return perimeter;
    }

    public FigureType getType(){
        return type;
    }
    protected abstract double getArea();

    @Override
    public String toString(){
        return type + " - area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
