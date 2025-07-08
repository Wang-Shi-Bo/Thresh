package collections.collection.list;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("all")
public class MyLinkedList {
    public static void main(String[] args) {
        List list = new LinkedList();
    }




    class Node {
        Object data;
        Node next;
        Node prev;

        public Node(Object data) {
            this.data = data;
        }
    }
}
