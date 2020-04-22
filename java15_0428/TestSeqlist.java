package java15_0428;

public class TestSeqlist {
    public static void testAdd() {
        Seqlist Seqlist = new Seqlist();
        Seqlist.add(0, 9);
        Seqlist.add(0, 5);
        Seqlist.add(0, 2);
        Seqlist.add(0, 7);
        Seqlist.display();
    }

    public static void testContains() {
        Seqlist Seqlist = new Seqlist();
        Seqlist.add(0, 100);
        Seqlist.add(0, 200);
        Seqlist.add(0, 300);
        Seqlist.add(0, 400);
        System.out.println(Seqlist.contains(300));
    }

    static void testSearch() {
        Seqlist Seqlist = new Seqlist();
        Seqlist.add(0, 100);
        Seqlist.add(0, 200);
        Seqlist.add(0, 300);
        Seqlist.add(0, 400);
        System.out.println(Seqlist.search(200));
    }

    public static void testRemove(){
        Seqlist Seqlist = new Seqlist();
        Seqlist.add(0, 100);
        Seqlist.add(0, 200);
        Seqlist.add(0, 300);
        Seqlist.add(0, 400);
        Seqlist.remove(200);
        Seqlist.display();
    }
    public static void main(String[] args) {
        //testAdd();
        //testContains();
        testSearch();
        testRemove();
    }
}
