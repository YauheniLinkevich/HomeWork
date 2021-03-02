package HomeWork1;

public class Task6 {
//    public static void main(String[] args) {
//        System.out.println(createPhoneNumber(new int[] {6, 2, 1, 7, 7, 8, 1, 3, 2, 9}));
//    }

    public static String createPhoneNumber(int[] numbers) {
        String result = "", subStr1 = "(", subStr2 = "",subStr3 = "";

        for(int i = 0; i < 3; i++) {
            subStr1 += numbers[i];
        }
        subStr1 += ") ";

        for(int i = 3; i < 6; i++) {
            subStr2 += numbers[i];
        }
        subStr2 += "-";

        for(int i = 6; i < 10; i++) {
            subStr3 += numbers[i];
        }

        return result = result + subStr1 + subStr2 + subStr3;
    }
}
