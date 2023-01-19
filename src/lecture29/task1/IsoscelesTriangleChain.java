package lecture29.task1;

public class IsoscelesTriangleChain extends TriangleChain {
    public IsoscelesTriangleChain() {
        super(Triangle.TypeOfTriangle.ISOSCELES);
    }

    @Override
    public double calculateSquare(Triangle triangle) {
        return 0.5 * getH(triangle) * getBasic(triangle);
    }

    private int getBasic(Triangle triangle) {

        int a = triangle.getSideA();
        int b = triangle.getSideB();
        int c = triangle.getSideC();
        int basic;
        if (a == b) {
            basic = c;
        } else if (a == c) {
            basic = b;
        } else {
            basic = a;
        }
        return basic;
    }

    private double getH(Triangle triangle) {
        double h = .0;
        double halfOfBasic = (double) getBasic(triangle) ;
        int anotherSide = triangle.getSideA();

        if (halfOfBasic == anotherSide) {
            anotherSide = triangle.getSideB();
        }
        halfOfBasic = (double) halfOfBasic / 2;
        return Math.sqrt(anotherSide*anotherSide - halfOfBasic * halfOfBasic );
    }


}
