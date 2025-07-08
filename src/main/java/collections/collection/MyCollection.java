package collections.collection;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        Iterator it = col.iterator();
        while (it.hasNext()) {
            Object next =  it.next();

        }

        //
        for (String s : col) {
            System.out.println(s);
        }
    }
}
