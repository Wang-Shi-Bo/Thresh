package collections.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyArrayList {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add("a");
        list.add(1);
        list.add(null);
        System.out.println(list);

        List<Object> v = new Vector<>();
        v.add("a");

        Vector l  = new Vector();

    }
}
