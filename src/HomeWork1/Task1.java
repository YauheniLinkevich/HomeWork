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

        /// operations with numbers -42 and -15
        // ~ -42: 1101 0110 -> 0010 1001; -15: 1111 0001 -> 0000 1110
        firstNumber = -42;
        secondNumber = -15;
        result = ~firstNumber;
        result = ~secondNumber;

        // & result == -48: 1101 0000
        result = firstNumber & secondNumber;

        // &= -42: 1101 0110 -> 1101 0000; -15: 1111 0001 -> 1101 0000
        firstNumber &= secondNumber;
        firstNumber = -42;
        secondNumber &= firstNumber;
        secondNumber = -15;

        // | result == -9: 1111 0111
        result = firstNumber | secondNumber;

        // |= -42: 1101 0110 -> 1111 0111; -15: 1111 0001 -> 1111 0111
        firstNumber |= secondNumber;
        firstNumber = -42;
        secondNumber |= firstNumber;
        secondNumber = -15;

        // ^ result == 39: 0010 0111
        result = firstNumber ^ secondNumber;

        // ^= -42: 1101 0110 -> 0010 0111; -15: 1111 0001 -> 0010 0111
        firstNumber ^= secondNumber;
        firstNumber = -42;
        secondNumber ^= firstNumber;
        secondNumber = -15;

        // >> -42 >> 4: 1101 0110 -> 1111 1101; -15 >> 2: 1111 0001 -> 1111 1100
        result = firstNumber >> 4;
        result = secondNumber >> 2;

        // >>= -42 >> 2: 1101 0110 -> 1111 0101; -15 >> 3: 1111 0001 -> 1111 1110
        firstNumber >>= 2;
        secondNumber >>= 3;
        firstNumber = -42;
        secondNumber = -15;

        // >>> -42 >>> 3: 1101 0110 -> 00011111111111111111111111111010; -15 >>> 2: 1111 0001 -> 00111111111111111111111111111100
        result = firstNumber >>> 3;
        result = secondNumber >>> 2;

        // >>>= -42 >>> 3: 1101 0110 -> 00011111111111111111111111111010; -15 >>> 2: 1111 0001 -> 00111111111111111111111111111100
        firstNumber >>>= 3;
        secondNumber >>>= 2;
        firstNumber = -42;
        secondNumber = -15;

        // << -42 << 2: 1101 0110 -> 0101 1000; -15 << 4: 1111 0001 -> 0001 0000
        result = firstNumber << 2;
        result = secondNumber << 4;

        // <<= -42 << 1: 1101 0110 -> 1010 1100; -15 << 1: 1111 0001 -> 1100 0100
        firstNumber <<= 1;
        secondNumber <<= 2;
    }
}
