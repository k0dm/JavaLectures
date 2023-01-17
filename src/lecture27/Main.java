package lecture27;

import java.util.ArrayList;
import java.util.List;

public class Main  {

    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        list.contains("First");
        print(list);
        print( list.indexOf("First"));
        print(list.lastIndexOf("First"));
        list.add(2,"gg");
        list.set(3, "dd");
        print(list);

    }

    private static void print(Object o){
        System.out.println(o);
    }
}
