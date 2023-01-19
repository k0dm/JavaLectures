package lecture29.task1;

public class EquilateralTriangleChain extends TriangleChain {
    public EquilateralTriangleChain() {
        super(Triangle.TypeOfTriangle.EQUILATERAL);
    }

    @Override
    public double calculateSquare(Triangle triangle) {
        return triangle.getSideA() * triangle.getSideA() * Math.sqrt(3) / 4;
    }
}
