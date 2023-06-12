package site.telion.multithreading.creationThread1;

public class SeekingMax extends Thread {

    private final int[] array;

    private int max;

    public SeekingMax(int[] array) {
        this.array = array;
        if (array.length > 0) {
            max = array[0];
        }
    }
    @Override
    public void run() {
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
    }

    public int getMax() {
        return max;
    }
}
