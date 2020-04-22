package java15_0428;

public class LinkedListOJ {
    static class Node {
        private int val;
        Node next = null;

        public Node(int val) {
            this.val = val;
        }
    }

    //1.删除指定节点的值
    public Node removeElements(Node head, int val) {
        if (head == null) {
            return null;
        }
        Node pre = head;
        Node cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = pre.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }
        return head;
    }

    //2.反转一个单链表
    public Node reverseList(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Node newhead = null;
        Node cur = head;
        Node pre = null;
        while (cur != null) {
            Node next = cur.next;
            if (next == null) {
                newhead = head;
            }
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return newhead;
    }

    //3.给定一个带有头结点 head 的非空单链表，返回链表的中间结点。如果有两个中间结点，则返回第二个中间结点.
    public Node middleNode(Node head) {
        //该链表非空
        int steps = size(head) / 2;
        Node cur=head;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }
    //写一个辅助得到链表长度的的方法
    private int size(Node head) {
        int size = 0;
        Node cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    //4. 输入一个链表，输出该链表中倒数第k个结点.
    public Node FindKthToTail(Node head, int k) {
        if(head==null){
            return null;
        }
        int size=size(head);
        if(k<=0||k>size){
            return null;
        }
        int steps=size-k;
        Node cur=head;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }

    //5. 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的.
    public Node mergeTwoLists(Node l1, Node l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        //创建一个临时节点记录节点,储存一个什么样的值都可以
        Node newHead=new Node(-1);
        Node newTail=newHead;
        Node cur1=l1;
        Node cur2=l2;
        while (cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                //因为l1和l2已经是两个有序链表了,所以不需要new一个新节点来存储
                //节点的值,直接用.next指向就行,这点和下题不太一样.
                newTail.next=cur1;
                newTail=newTail.next;
                cur1=cur1.next;
            }else {
                newTail.next=cur2;
                newTail=newTail.next;
                cur2=cur2.next;
            }
        }
        if(cur1==null){
            newTail.next=cur2;
        }else {
            newTail.next=cur1;
        }
        return newHead.next;
    }

    //6.编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前 。
    public Node partition(Node pHead, int x) {
        if (pHead == null) {
            return null;
        }
        if (pHead.next == null) {
            return pHead;
        }
        Node bigHead=new Node(-1);
        Node bigTail=bigHead;
        Node smallHead=new Node(-1);
        Node smallTail=smallHead;
        for(Node cur=pHead;cur!=null;cur=cur.next){
            if(cur.val<x){
                // 插入到 smallTail 后面, 创建崭新的节点(新节点的 next 一定是 null)
                smallTail.next=new Node(cur.val);
                smallTail=smallTail.next;
            }else {
                bigTail.next=new Node(cur.val);
                bigTail=bigTail.next;
            }
        }
        smallTail.next=bigHead.next;
        return smallHead.next;
    }
    public static void main(String[] args) {
        // 构造一下刚才的数据, 本地测试一下
        Node a = new Node(9);
        Node b = new Node(5);
        Node c = new Node(2);
        Node d = new Node(7);
        Node e = new Node(3);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        int x = 4; // 基准值
        LinkedListOJ test = new LinkedListOJ();
        Node result = test.partition(a, x);
        for (Node cur = result; cur != null; cur = cur.next) {
            System.out.println(cur.val);
        }
    }
    //7.在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    public Node deleteDuplication(Node pHead) {
        Node newHead=new Node(-1);
        Node newTail=newHead;
        Node cur=pHead;
        while (cur!=null){
            if(cur.next!=null&&cur.val==cur.next.val){
                while (cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
            }
            newTail.next=new Node(cur.val);
            newTail=newTail.next;
            cur=cur.next;
        }
        return newHead.next;
    }
}
