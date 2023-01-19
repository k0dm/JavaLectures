package lecture29.task1;

public class CommonTriangleChain extends TriangleChain {


    public CommonTriangleChain() {
        super(Triangle.TypeOfTriangle.COMMON);
    }

    @Override
    public double calculateSquare(Triangle triangle) {

            double p = (double) (triangle.getSideA() + triangle.getSideB() + triangle.getSideC()) / 2;
            return Math.sqrt(p * (p - triangle.getSideA()) * (p - triangle.getSideB()) * (p - triangle.getSideC()));
    }
}
