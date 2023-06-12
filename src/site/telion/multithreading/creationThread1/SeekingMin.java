package site.telion.multithreading.creationThread1;

public class SeekingMin extends Thread {

    private final int[] array;
    private int min;

    public SeekingMin(int[] array) {
        this.array = array;
        if (array.length > 0) {
            min = array[0];
        }
    }
    @Override
    public void run() {
        for (int i = 1; i < array.length; i++) {
            min = Math.min(array[i], min);
        }
    }

    public int getMin() {
        return min;
    }
}
