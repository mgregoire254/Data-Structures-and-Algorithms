package Linked_Lists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<String> linkedlist = new LinkedList<String>();

        //LinkedLists can act like Stacks
        linkedlist.push("game1");
        linkedlist.push("game2");
        linkedlist.push("game3");
        linkedlist.push("game4");
        linkedlist.pop();

        LinkedList<String> linkedlist2 = new LinkedList<String>();

        //LinkedLists can act like Queues
        linkedlist2.offer("game1");
        linkedlist2.offer("game2");
        linkedlist2.offer("game3");
        linkedlist2.offer("game5");

        //addmelements to linkedlist out of order
        linkedlist2.add(3, "game4");
        System.out.println(linkedlist2);

        //find and print index of element in linkedlist
        System.out.println(linkedlist2.peekFirst());

        System.out.println(linkedlist2.peekLast());

        linkedlist2.addFirst("game0");
        System.out.println(linkedlist2);

        linkedlist2.addLast("Game6");
        System.out.println(linkedlist2);

        linkedlist2.removeFirst();
        System.out.println(linkedlist2);

        linkedlist2.removeLast();
        System.out.println(linkedlist2);




    }
}
