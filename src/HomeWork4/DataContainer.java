package HomeWork4;

import java.util.*;

public class DataContainer<T> {

    private int dataSize;

    private T[] data;

    private final int DEFAULT_CAPACITY = 5;

    DataContainer() {
        data = Arrays.copyOf(data, DEFAULT_CAPACITY);
        dataSize = 0;
    }

    DataContainer(T[] data){
        this.data = data;

        for (T datum : this.data) {
            if(datum != null) {
                dataSize++;
            }
        }
    };

    public int add(T item) {

        if(item != null) {
            if (dataSize == data.length) {
                increaseCapacity();
            }
            for(int i = 0; i < data.length - 1; i++) {
                if(data[i] == null) {
                    data[i] = item;
                    return i;
                }
            }
        }
        return -1;
    }

    public T[] getItems() {
        return this.data;
    };

    public T get(int index) {
        if(index >= data.length || index < 0) {
            return null;
        }
        return data[index];
    };

    private int getDataSize() {
        return dataSize;
    }

    private int calculateDataSize() {
        int count = 0;
        for (T datum : data) {
            if(datum != null) {
                count++;
            }
        }
        return count;
    }

    public boolean delete(int index) {
        if(index >= data.length || index < 0) {
            return false;
        }
        deleteItemByIndex(index);

        return true;
    }

    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if(data[i] == item) {
                deleteItemByIndex(i);
                return true;
            }
        }

        return false;
    }

    private void sortNull() {
        T[] tmpData = data;
        data = (T[]) new Object[tmpData.length];
        for (int i = 0, j = 0; i < tmpData.length; i++) {
            if (tmpData[i] != null) {
                data[j] = tmpData[i];
                j++;
            }
        }
    }

    private void deleteItemByIndex(int index) {
        for(int i = index; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        data = Arrays.copyOf(data, data.length - 1);
    }
    private void increaseCapacity() {
        data = Arrays.copyOf(data, dataSize + 1);
    }

    public String toString(){
        if (this.data != null){
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{");
            for (int i = 0; i < this.data.length; i++) {
                stringBuilder.append(this.data[i]);
                if (i != (this.data.length - 1)){
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append("}");
            return stringBuilder.toString();
        } else {
            return null;
        }
    }

    public void sort(Comparator<T> comparator) {
        Arrays.sort(data, 0, calculateDataSize(), comparator);
    }

    public static <T extends Comparable<T>> void sortWithoutComparator(DataContainer<T> container) {
        container.sortNull();
        container.sort(null);
        //Arrays.sort(container.data, 0, container.calculateDataSize(),null);
    }

    public static <T extends Comparable<T>> void sortComparator(DataContainer<T> container, Comparator<T> comparator) {
        container.sortNull();
        container.sort(comparator);
        //Arrays.sort(container.data, 0, container.calculateDataSize(), comparator);
    }

}
