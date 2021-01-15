package HomeWork2.Task2;

public class TaskFromWebsite {
    public static void main(String[] args) {
        int[] testArray  = {1, 5, -6, 2, -10, 32984, 999998, -23894, 92, -23894, 243, -50};

        int sum = sumPositiveElements(testArray);
        System.out.println("Sum:" + sum);

        int max = maxOddIndexElements(testArray);
        System.out.println("Max odd element:" + max);

        int[] lesserThanAverage = elementsLesserThanAverage(testArray);
        System.out.println("Elements lesser than average value:");
        for (int i : lesserThanAverage) {
            System.out.print(i + " ");
        }

        int[] minArray = twoMinimalElements(testArray);
        System.out.println("\nTwo minimal elements: first - " + minArray[0] +"; second - " + minArray[1]);

        int[] newArray = removeElementsFromRange(testArray, -5, 100);
        System.out.println("New array:");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }

    public static int sumPositiveElements(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > 0 && array[i] % 2 == 0) {
                sum += array[i];
            }
        }

        return sum;
    }

    public static int maxOddIndexElements(int[] array) {
        int max = 0;

        for(int i = 2; i < array.length; i += 2){
            if(array[max] < array[i]) {
                max = i;
            }
        }

        return array[max];
    }

    public static int[] elementsLesserThanAverage(int[] array) {
        int[] resultArray = new int[array.length];
        int avgValue = 0, index = 0;

        for(int i = 0; i < array.length; i++){
            avgValue += array[i];
        }

        avgValue /= array.length;

        for(int i = 0; i < array.length; i++){
            if(array[i] < avgValue){
                resultArray[index++] = array[i];
            }
        }

        return resultArray;
    }

    public static int[] twoMinimalElements(int[] array) {
        int[] minArray = new int[2];
        minArray[0] = Integer.MAX_VALUE;
        minArray[1] = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++){
            if(array[i] < minArray[0]){
                minArray[1] = minArray[0];
                minArray[0] = array[i];
            } else if(array[i] < minArray[1] && array[i] != minArray[0]){
                minArray[1] = array[i];
            }
        }

        return minArray;
    }

    public static int[] removeElementsFromRange(int[] array, int leftBorder, int rightBorder) {
        int[] newArray;
        int lastDeletionIndex = array.length , i = 0;
        while(i < lastDeletionIndex){
            if(array[i] >= leftBorder && array[i] <= rightBorder){

                for(int current = i, next = i + 1; current < lastDeletionIndex - 1; current++, next++){
                    array[current] = array[next];
                }
                lastDeletionIndex--;
            } else {
                i++;
            }
        }

        newArray = new int[lastDeletionIndex];
        for(i = 0; i < lastDeletionIndex; i++){
            newArray[i] = array[i];
        }

        return newArray;
    }
}
