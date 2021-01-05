package HomeWork1;

public class Task2 {
    public static void main(String[] args) {
        int result = 0, a = 2, b = 8;

        //2.1: 5 + 2 / 8 == 5
        //division goes before addition
        result = 5 + 2 / 8;

        //2.2: (5 + 2) / 8 == 0
        //brackets have higher priority than division;
        result = (5 + 2) / 8;

        //2.3: (5 + 2++) / 8 == 0
        // 7 / 8
        result = (5 + a++) / 8;
        a = 2;

        //2.4: (5 + 2++) / --8 == 1
        //division by 7
        result = (5 + a++) / --b;
        a = 2;
        b = 8;

        //2.5: (5 * 2 >> 2++) / --8 == 0
        //1.multiply; shifting "10" by 2 positions on the right it will be "2"; 3.division by 7
        result = (5 * 2 >> a++) / --b;
        a = 2;
        b = 8;

        //2.6: (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8 == 1
        //1. multiply; 2. shifting "44" by 2 positions on the right it will be "11"; 3.ternary operator; 4.division by 7
        result = (5 + 7 > 20 ? 68 : 22 * 2 >> a++) / --b;
        a = 2;
        b = 8;

        //2.7: (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> 2++) / --8 == error
        //compilation error because of 68 >= 68 - returns boolean type; types would be mixed(int and boolean)
        //result = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> a++) / --b;

        //2.8: 6 - 2 > 3 && 12 * 12 <= 119
        //boolResult == false: (6 - 2 > 3 -> true) && (12 * 12 <= 119 -> false) -> false
        boolean boolResult = 6 - 2 > 3 && 12 * 12 <= 119;

        //2.9 true && false
        //boolResult == false: && - operator AND
        boolResult = true && false;
    }
}
