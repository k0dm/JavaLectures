package lecture29.task1;

public abstract class TriangleChain implements Square {
    private final Triangle.TypeOfTriangle type;
    private TriangleChain nextTriangleChain;

    public TriangleChain(Triangle.TypeOfTriangle type) {
        this.type = type;
    }


    public double square(Triangle triangle) {
        double result = .0;
        if (type == triangle.getType()) {
            result = calculateSquare(triangle);
            System.out.println("This is a " + triangle.getType() + " triangle, square: " + result);

        } else if (nextTriangleChain != null) {
            nextTriangleChain.square(triangle);
        } else {
            throw new IllegalArgumentException("square can`t be calculated");
        }
        return result;
    }

    public void setNextTriangleChain(TriangleChain nextTriangleChain) {
        this.nextTriangleChain = nextTriangleChain;
    }
}
