package HomeWork2.Task4;

import java.util.Arrays;

public class TaskSortMethods {
    public void bubbleSort(int[] array){

        boolean isSwapped = true;
        while(isSwapped) {
            isSwapped = false;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSwapped = true;

                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }
    }

    public void coctailSort(int[] array) {
        int left = 0, right = array.length - 1;
        do{
            for(int i = left; i < right; i++){
                if(array[i] > array[i+1]){
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
            right--;

            for(int i = right; i > left; i--){
                if(array[i] < array[i-1]){
                    int tmp = array[i];
                    array[i] = array[i-1];
                    array[i-1] = tmp;
                }
            }
            left++;
        }while(left <= right);
    }
}
