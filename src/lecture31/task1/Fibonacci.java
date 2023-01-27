package lecture31.task1;

public class Fibonacci {
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 1;
        fibonacci(1,1,2);
    }

    public static void fibonacci(double num1, double num2,int amount ) {
        double sum = num1 + num2;
        System.out.print(num2 + " ");
        if (amount > 0)
        fibonacci(num2, sum, --amount);
    }
}
