package lecture29.task1;

public class RightTriangleChain extends TriangleChain{
    public RightTriangleChain() {
        super(Triangle.TypeOfTriangle.RIGHT);
    }

    @Override
    public double calculateSquare(Triangle triangle) {
        int[] legs = getLegs(triangle);
        return 0.5 * legs[0] * legs[1];
    }
    private int[] getLegs(Triangle triangle){
        int[] legs = new int[2];
        int a = triangle.getSideA();
        int b = triangle.getSideB();
        int c = triangle.getSideC();

        if( a > b && a > c) {
            legs[0] = b;
            legs[1] = c;
        }else if(b > c ){
            legs[0] = a;
            legs[1] = c;
        }else {
            legs[0] = a;
            legs[1] = b;
        }
        return legs;
    }
}
