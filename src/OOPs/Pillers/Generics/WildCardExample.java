package OOPs.Pillers.Generics;

import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends Number> {
    private Object[] data;
    private int size;
    private static final int DEFAULT_SIZE = 10;

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
        size = 0;
    }

    public void getList(List<? extends Number> list) {

    }

    public T remove(int index) {
        T num = (T)(data[index]);
        for(int i = index; i < size-1; i++) {
            data[i] = data[i+1];
        }
        size--;
        return num;
    }

    public void add(T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for(int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public int size() {
        return size;
    }

    public T remove() {
        T remove = (T)(data[--size]);
        return remove;
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
