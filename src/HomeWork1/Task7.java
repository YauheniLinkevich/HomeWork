package HomeWork1;

import java.util.Base64;

public class Task7 {
    public static void main(String[] args) {
        String result1, result2;

        result1 = toBinaryString((byte)6);
        result2 = toBinaryString((byte)-6);

        System.out.println("first - " + result1);
        System.out.println("second - " + result2);
    }

    public static String toBinaryString(byte number) {

        String result = "";
        //index required to fill array with digits in appropriate position
        byte index = 7;
        boolean isNumber = number == 0 ? false : true;
        boolean isPositive = number > 0 ? true : false;
        byte[] resultArray = new byte[8];
        //fill array with 0 or 1 for required output format
        if (isPositive) {
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = 0;
            }
        } else {
            for (int i = 0; i < resultArray.length; i++) {
                resultArray[i] = 1;
            }
        }

//        if(!isPositive) {
//            number *= (-1);
//        }
        //main cycle
        while(isNumber) {

            if(number == 0 || number == -1) {
                break;       
            }

            byte tmp = 0;
            tmp = (byte) (number % 2 == 0 ? 0 : 1);
            resultArray[index--] = tmp;

            number >>= 1;
        }
        
        for(int i = 0; i < resultArray.length; i++) {
            result += resultArray[i];
        }

        return result;
    }
}
