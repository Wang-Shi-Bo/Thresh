package collections.collection.set;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")
public class MyHashSet {
    public static void main(String[] args) {
//        Set set = new HashSet();
//        set.add("mata");
//        set.add("mars");
//        set.add(new Dog("www"));
//        set.add(new Dog("www"));
//        System.out.println(set);

        ///


        Node[] table = new Node[5];
        table[3] = new Node("mars", null);
        table[2] = new Node("mata", table[3]);

        System.out.println(table[2].next);

    }
}

@SuppressWarnings("all")
class Node{
    Object item;
    Node next;

    public Node(Object item, Node next){
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString(){
        return item.toString() + "->" + next;
    }
}

@SuppressWarnings("all")
class Dog {
    private String name;
    public Dog(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
 }
