package OOPs.Pillers.Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int size;
    private static final int DEFAULT_SIZE = 10;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
        size = 0;
    }

    public int remove(int index) {
        int num = data[index];
        for(int i = index; i < size-1; i++) {
            data[i] = data[i+1];
        }
        size--;
        return num;
    }

    public void add(int num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(Arrays.copyOfRange(data,0,size)) +
                ", size=" + size +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                '}';
    }
}
