package HomeWork5.utils;

import java.util.Comparator;
import java.util.List;

public class SortUtils {
    public static <T> void bubbleSort(List<T> collection, Comparator<T> comparator) {
        boolean isSwapped = true;
        int collectionSize = collection.size();
        while(isSwapped) {
            isSwapped = false;
            for (int i = 0; i < collectionSize - 1; i++) {
                T first = collection.get(i);
                T second = collection.get(i + 1);
                int compareResult = comparator.compare(first, second);
                if(compareResult > 0){
                    isSwapped = true;

                    collection.set(i, second);
                    collection.set(i + 1, first);
                }
            }
        }
    }

    public static <T> void coctailSort(List<T> collection, Comparator<T> comparator) {
        int left = 0, right = collection.size() - 1;
        do{
            for(int i = left; i < right; i++){
                T first = collection.get(i);
                T second = collection.get(i+1);
                int compareResult = comparator.compare(collection.get(i), collection.get(i + 1));
                if(compareResult > 0){
                    collection.set(i, second);
                    collection.set(i + 1, first);
                }
            }
            right--;

            for(int i = right; i > left; i--){
                T first = collection.get(i - 1);
                T second = collection.get(i);
                int compareResult = comparator.compare(collection.get(i - 1), collection.get(i));
                if(compareResult > 0){
                    collection.set(i - 1, second);
                    collection.set(i, first);
                }
            }
            left++;
        }while(left <= right);
    }
}
