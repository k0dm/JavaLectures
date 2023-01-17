package lecture29.task1;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        if (sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            throw new IllegalArgumentException("can`t create triangle with sides: A = " + sideA +
                    ", B = " + sideB + ", C = " + sideC);
        }
    }

    public TypeOfTriangle getType() {
        TypeOfTriangle type;
        if (sideA == sideB && sideA == sideC) {
            type = TypeOfTriangle.EQUILATERAL;
        } else if (sideA == sideB || sideA == sideC || sideB == sideC) {
            type = TypeOfTriangle.ISOSCELES;
        } else if (sideA * sideA + sideB * sideB == sideC * sideC ||
                sideA * sideA + sideC * sideC == sideB * sideB ||
                sideC * sideC + sideB * sideB == sideA * sideA
        ) {
            type = TypeOfTriangle.RIGHT;
        } else {
            type = TypeOfTriangle.COMMON;
        }
        return type;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }


    enum TypeOfTriangle {
        COMMON,
        ISOSCELES,  //рівнобедрений
        EQUILATERAL,
        RIGHT

    }
}
