package java15_0428;

public class TestLinkedList {
    private static void testAddFirst() {
       Linkedlist LinkedList = new Linkedlist();
       LinkedList.addFirst(1);
       LinkedList.addFirst(2);
       LinkedList.addFirst(3);
       LinkedList.addFirst(4);
       LinkedList.display();
    }

    private static void testAddIndex() {
       Linkedlist LinkedList = new Linkedlist();
       LinkedList.addIndex(0, 1);
       LinkedList.addIndex(1, 3);
       LinkedList.addIndex(1, 2);
       LinkedList.addIndex(4, 2);
       LinkedList.display();
    }

    private static void testContains(){
       Linkedlist LinkedList=new Linkedlist();
       LinkedList.addFirst(1);
       LinkedList.addFirst(3);
       LinkedList.addFirst(2);
       LinkedList.addFirst(6);
        System.out.println(LinkedList.contains(33));
    }
    public static void main(String[] args) {
//        testAddFirst();
        testAddIndex();
//        testContains();
    }
}
