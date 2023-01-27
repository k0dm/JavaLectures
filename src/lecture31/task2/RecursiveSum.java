package lecture31.task2;

public class RecursiveSum {

    public static void main(String[] args) {
        System.out.println(sum(41692));
//        for (int i =0; i < Integer.MAX_VALUE; i++) {
//            System.out.println(i + " - " + sum(i));
//        }
    }

    public static int sum(int n) {
        int sum = n;

        if (n != 0) {
            if (n > 0) {
                sum += sum(--n);
            }else {
                sum += sum(++n);
            }
        }
        return sum;
    }
}
