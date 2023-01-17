package lecture29.task1;

public class Main {
    public static void main(String[] args) {
        EquilateralTriangleChain chain0 = new EquilateralTriangleChain();
        IsoscelesTriangleChain chain1 = new IsoscelesTriangleChain();
        RightTriangleChain chain2 = new RightTriangleChain();
        CommonTriangleChain chain3 = new CommonTriangleChain();
        chain2.setNextTriangleChain(chain3);
        chain1.setNextTriangleChain(chain2);
        chain0.setNextTriangleChain(chain1);

        chain0.square(new Triangle(3, 4, 5));
        chain0.square(new Triangle(3, 3, 5));
        chain0.square(new Triangle(2, 2, 2));
        chain0.square(new Triangle(3, 4, 6));


    }
}
