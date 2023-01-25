package lecture29.task8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SafeList<String> list = new SafeList<>(new ArrayList<String>());
        list.add("a");
        list.add("a");
        list.add(null);
        printList(list);

        list.add(-1,null);
        list.add(1,null);
        list.set(-1, null);
        list.set(1,null);
        printList(list);
        list.clear();
        list.set(0,"dffd");
        printList(list);

        list.get(-10);
        list.get(10);
        System.out.println(list.get(0));
        System.out.println(list.get(10));
        System.out.println(list.get(-10));
        list.add("3");
        System.out.println(list.get(0));


    }
    public static void printList(SafeList<? extends Object> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
