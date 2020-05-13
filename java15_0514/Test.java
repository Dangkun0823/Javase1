package java15_0514;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        //Thread.sleep(99999L);
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(9999L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"第一滴血").start();
        Thread.sleep(9999L);
    }
    //第三段代码:观察main和子线程同时阻塞

}
