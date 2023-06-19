package site.telion.KATA_EVERY_DAY.IntegerArrayList;

import java.util.Arrays;

public class IntegerArrayList {

    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntegerArrayList() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public IntegerArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            elements = new int[initialCapacity];
        } else {
            throw new IllegalStateException("Capacity can't be less than 0!");
        }
    }

    private int isIndexExist(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + elements.length);
        }
        return index;
    }

    public int get(int index) {
        isIndexExist(index);
        return elements[index];
    }

    public int size() {
        return size;
    }

    public boolean add(int value) {
        if (size == elements.length) {
            elements = increaseCapacity();
        }
        elements[size] = value;
        size++;
        return true;
    }

    private int[] increaseCapacity() {
        int[] temp = new int[(elements.length * 2)];
        System.arraycopy(elements, 0, temp, 0, elements.length);
        return temp;
    }

    public int set(int value, int index) {
        isIndexExist(index);
        int temp = elements[index];
        elements[index] = value;
        return temp;
    }

    @Override
    public String toString() {
        int[] temp = new int[size];
        System.arraycopy(elements, 0, temp, 0, size);
        return Arrays.toString(temp);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int remove(int index) {
        isIndexExist(index);
        int[] temp = elements;
        elements = new int[temp.length - 1];
        int value = temp[index];
        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);
        size--;
        return value;
    }
}

