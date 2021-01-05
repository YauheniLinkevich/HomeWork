package HomeWork1;

public class Task1 {
    public static void main(String[] args) {
        int firstNumber = 42, secondNumber = 15, result = 0;

        /// operations with numbers 42 and 15
        // ~ 42: 0010 1010 -> 1101 0110; 15: 0000 1111 -> 1111 0001
        result = ~firstNumber;
        result = ~secondNumber;

        // & result == 10: 0000 1010
        result = firstNumber & secondNumber;

        // &= 42: 0010 1010 -> 10: 0000 1010; 15: 0000 1111 -> 0000 1010
        firstNumber &= secondNumber;
        firstNumber = 42;
        secondNumber &= firstNumber;
        secondNumber = 15;

        // | result == 47: 0010 1111
        result = firstNumber | secondNumber;

        // |= 42: 0010 1010 -> 0010 1111; 15: 0000 1111 -> 0010 1111
        firstNumber |= secondNumber;
        firstNumber = 42;
        secondNumber |= firstNumber;
        secondNumber = 15;

        // ^ result == 37: 0010 0101
        result = firstNumber ^ secondNumber;

        // ^= 42: 0010 1010 -> 0010 0101; 15: 0000 1111 -> 0010 0101
        firstNumber ^= secondNumber;
        firstNumber = 42;
        secondNumber ^= firstNumber;
        secondNumber = 15;

        // >> 42 >> 4: 0010 1010 -> 0000 0010; 15 >> 2: 0000 1111 -> 0000 0011
        result = firstNumber >> 4;
        result = secondNumber >> 2;

        // >>= 42 >> 2: 0010 1010 -> 0000 1010; 15 >> 3: 0000 1111 -> 0000 0001
        firstNumber >>= 2;
        secondNumber >>= 3;
        firstNumber = 42;
        secondNumber = 15;

        // >>> 42 >>> 3: 0010 1010 -> 0000 0101; 15 >>> 2: 0000 1111 -> 0000 0011
        result = firstNumber >>> 3;
        result = secondNumber >>> 2;

        // >>>= 42 >>> 3: 0010 1010 -> 0000 0101; 15 >>> 2: 0000 1111 -> 0000 0011
        firstNumber >>>= 3;
        secondNumber >>>= 2;
        firstNumber = 42;
        secondNumber = 15;

        // << 42 << 2: 0010 1010 -> 1010 1000; 15 << 4: 0000 1111 -> 1111 0000
        result = firstNumber << 2;
        result = secondNumber << 4;

        // <<= 42 << 1: 0010 1010 -> 0101 0100; 15 << 1: 0000 1111 -> 0011 1100
        firstNumber <<= 1;
        secondNumber <<= 2;
    }
}
