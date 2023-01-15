import lecture18.CommandAndResult;
import lecture19.Triangle;
import lecture20.Point;
import lecture20.Rectangle;
import lecture21.Figure;
import lecture23.Developer;
import lecture23.DeveloperFactory;
import lecture23.FigureFactory;
import lecture24.DeveloperType;
import lecture24.FigureType;
import lecture25.MyData;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;


public class Main {

    private static final int CREDIT_MAX = 150_000;
    private static final int SALARY_MIN = 25_000;
    private static final int DURATION_MAX = 12;
    private static final String DENIED = "You have been refused a loan!";

    private static final CommandAndResult[] COMMAND_AND_RESULTS = new CommandAndResult[]{
            new CommandAndResult("/help", ""),
            new CommandAndResult("/start", "Bot started!"),
            new CommandAndResult("/getLocation", "location in Volyn"),
            new CommandAndResult("/end", "Bot ended")
    };



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyData data = getMyData();
        if(data == null) {
           print("object was null");
        }
        else {
            print(data.toString());
        }



        //FigureFactory factory = new FigureFactory();
    //    print( factory.create(3,4,5), factory.create(2,2,3,3) );
      /*24  DeveloperFactory factory = new DeveloperFactory();
        Developer[] developers = new Developer[10];
        for(int i = 0; i < 10; i++){
            developers[i] = factory.create((int)(Math.random() * 10 % 3 + 1),(int)(Math.random()*1000));
            print(developers[i]);
        }

        for (Developer developer : developers){
            if(developer.getType() != DeveloperType.JUNIOR){
                print("Your devType: " + developer.getType());
            }
        }*/
     }




    @NotNull
    private static MyData getMyData() {
        return new MyData(1, "111");
    }

     private static void showDescription(Figure figure) {
         switch (figure.getType()) {
             case RECTANGLE:
                 print("rectangle");
                 break;
             case TRIANGLE:
                 print("triangle");
                 break;
             default:
                 print("undefined figure");
         }
     }




    public static void print(Figure... figures){
        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
    }

      public static void print(Developer... developers){
        for (Developer developer : developers) {
            System.out.println(developer.toString());
        }
    }
    public static void arithmeticProgression() {
        Scanner scanner = new Scanner(System.in);
        int count = 2;
        int firstNumber;
        int secondNumber;
        int difference;
        print("Enter 10 numbers:");
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();
        difference = secondNumber - firstNumber;
        while (count < 10) {
            firstNumber = secondNumber;
            if((secondNumber = scanner.nextInt())-firstNumber != difference){
                print("This number does't form an arithmetic progression");
                break;
            }
            count++;
        }
    }

    public static void credit() {
        Scanner scanner = new Scanner(System.in);

        int duration;
        int credit;
        System.out.print("What is your salary $: ");
        if (scanner.nextInt() < SALARY_MIN) {
            print(DENIED);
        } else {
            System.out.print("Enter the amount of money: ");
            if ((credit = scanner.nextInt()) > CREDIT_MAX) {
                print(DENIED);
            } else {
                System.out.print("Enter the refund period(num of months): ");
                if ((duration = scanner.nextInt()) > DURATION_MAX) {
                    print(DENIED);
                } else {
                    print("Congratulations, you have received a credit of $" + credit + " for " + duration + " months!");
                }

            }
        }
    }

    public static void aMultipleOfFive() {
        Scanner scanner = new Scanner(System.in);
        int number;
        for (int i = 0; i < 20; i++) {
            number = scanner.nextInt();
            if (number % 5 == 0) {
                print(number + " is a multiple of 5");
            } else {
                print(number + " isn`t multiple of 5");
            }

        }
    }

    public static void helloEveryone() {
        Scanner in = new Scanner(System.in);
        String name;
        while (!"Діма".equals(name = in.nextLine())) {
            print("Привіт, " + name);
        }
    }

    public static double[] multiplyArrays(int[] firstArray, int[] secondArray) {
        double[] resultArray = new double[]{};

        if (firstArray.length != secondArray.length || firstArray.length == 0) {
            print("Invalid arrays");
        } else {
            resultArray = new double[firstArray.length];
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = (double) firstArray[i] * secondArray[i];
            }

        }
        return resultArray;
    }

    public static int[] x2Array(int[] array) {
        int[] newArrayX2 = new int[array.length * 2];

        for (int i = 0; i < array.length; i++) {
            newArrayX2[i * 2] = array[i];
            newArrayX2[i * 2 + 1] = array[i];

        }
        return newArrayX2;
    }

    public static int[] sum2Array(int[] array) {
        int[] newArray = new int[array.length];
        if (array.length < 2) {
            print("array doesn`t have 2 elements");

        } else {
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i] + array[array.length - 1 - i];
            }

        }
        return newArray;
    }

    public static int[] sumArray(int[] array) {
        int[] newArray = new int[array.length];
        if (array.length < 2) {
            print("array doesn`t have 2 elements");

        } else {
            for (int i = 0; i < array.length; i++) {
                newArray[i] = (i == (array.length - 1)) ? array[i] : array[i] + array[i + 1];
            }
        }
        return newArray;
    }

    public static int[] abs(int[] array) {
        int[] newArray = array.clone();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray[i] = array[i] * -1;
            }
        }
        return newArray;
    }

    public static void showIndex(String[] array) {
        if (array.length == 0) {
            print("Array is empty");
        } else {
            String indexes = "";
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals("this")) {
                    if (!indexes.isEmpty()) {
                        indexes += ", ";
                    }
                    indexes += i;

                }

            }
            print(indexes);
        }
    }

    public static void printReverseIntArray(int[] array) {
        if (array.length == 0) {
            System.out.println("array is empty");
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static int differenceBetweenMaxAndMin(int[] arrayOfNumbers) {
        int difference = 0;
        if (arrayOfNumbers.length < 2) {
            System.out.println("This array doesn`t contain at least 2 items");
        } else {
            int max = 0;
            int min = arrayOfNumbers[0];

            for (int number : arrayOfNumbers) {
                if (max < number) {
                    max = number;
                } else if (min > number) {
                    min = number;
                }
            }
            difference = max - min;
        }
        return difference;
    }

    public static void fibonacci(int n) {
        if (n < 1) {
            System.out.println("n < 1");
        } else if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println("1\n1");
            int number1 = 1;
            int number2 = 1;
            int temp = 0;
            for (int i = 0; i < n; i++) {
                temp = number2;
                number2 += number1;
                number1 = temp;
                System.out.println(number2);
            }
        }
    }

    public static void print(int number) {
        System.out.println(number);
    }

    public static void print(String text) {
        System.out.println(text);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

}