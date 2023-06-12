package site.telion.multithreading.creationThread1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] a = {4, 1, -3, 8, -5, -15, -34535};
//        int[] a = {};
        SeekingMax t1 = new SeekingMax(a);
        SeekingMin t2 = new SeekingMin(a);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t1.getMax());
        System.out.println(t2.getMin());
    }

}
