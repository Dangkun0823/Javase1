package java15_0428;

class Node {
    public int data;
    Node next = null;

    public Node(int data) {
        this.data = data;
    }
}
public class Linkedlist {
    private Node head = null;

    //头插
    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    //尾插
    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = node;
    }

    public void display() {
        Node cur = head;
        for (cur = head; cur != null; cur = cur.next) {
            System.out.print(cur.data + " ");
        }
        System.out.println();
    }

    public int getSize() {
        int count = 0;
        for (Node cur = head; cur!= null; cur = cur.next) {
            count++;
        }
        return count;
    }

    public boolean addIndex(int index, int data) {
        int size = getSize();
        if (index < 0 || index > size) {
            return false;
        }
        if (index == 0) {
            addFirst(data);
            return true;
        }
        if (index == size) {
            addLast(data);
            return true;
        }
        Node node = new Node(data);
        Node pre = getPos(index - 1);
        node.next = pre.next;
        pre.next = node;
        return true;
    }

    private Node getPos(int index) {
        Node cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public boolean contains(int tofind) {
        Node cur = head;
        for (cur = head; cur!= null; cur = cur.next) {
            if (cur.data == tofind) {
                return true;
            }
        }
        return false;
    }

    public void remove(int toRemove) {
        if (head.data == toRemove) {
            head = head.next;
            return;
        }
        Node pre = searchPrev(toRemove);
        //pre.next=pre.next.next;
        Node toDelete = pre.next;
        pre.next = toDelete.next;
    }

    private Node searchPrev(int toRemove) {
        for (Node cur = head; cur != null && cur.next != null; cur = cur.next) {
            if (cur.next.data == toRemove) {
                return cur;
            }
        }
        return null;
    }
}
