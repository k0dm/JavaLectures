package lecture29.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("10")) {
            addNewStr(list, input);
            for (String str : list) {
                System.out.println(str);
            }
            input = scanner.nextLine();
        }
    }

    public static void addNewStr(List<String> list, String input) {
        if (list.isEmpty()) {
            list.add(input);
        } else {
            int inputSize = input.length();
            for (String str : list) {
                if (str.length() > inputSize) {
                    list.add(list.indexOf(str), input);
                    return;
                }
            }
            list.add(input);
        }

    }
}
