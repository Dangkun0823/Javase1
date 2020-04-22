package java15_0428;

public class Seqlist {
    private int[] arr = new int[100];
    private int size = 0;

    //打印元素
    public void display() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        System.out.print("]");
    }

    //新增一个元素
    public void add(int pos, int data) {
        if (pos < 0 || pos > size) {
            return;
        }
        if (size >= arr.length) {
            int[] newArr = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        if (pos == size) {
            arr[pos] = data;
            size++;
            return;
        }
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = data;
        size++;
    }

    //包含元素
    public boolean contains(int toFind) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //搜索元素
    int search(int toFind) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    public int getpos(int pos) {
        return arr[pos];
    }

    public void setpos(int pos, int data) {
        arr[pos] = data;
    }

    void remove(int toRemove) {
        int pos = search(toRemove);
        if (pos == -1) {
            return;
        }
        if(pos==size-1){
            size--;
            return;
        }
        for(int i=pos;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }

    public void clear(){
        size=0;
    }
}
