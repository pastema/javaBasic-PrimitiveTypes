package com.cultivation.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BooleanOperatorsTest {
    @SuppressWarnings({"PointlessBooleanExpression", "ConstantConditions"})
    @Test
    void should_perform_logical_boolean_operations() {
        boolean[] actualResults = {
                true && true, //true
                true && false, //false
                false && false, //false
                true || true, // true
                true || false, //true
                false || false, //false
                true & true, //true
                true & false, //false
                false & false, //false
                true | true, //true
                true | false, //true
                false | false, //false
                3 == 7,
                4 != 5
        };

        // TODO: please modify the following code to pass the test
        // <--start
        boolean[] expectedResult = {true,false,false,true,true,false,true,false,false,true,true,false,false,true};
        // --end-->

        assertArrayEquals(expectedResult, actualResults);
    }

    @Test
    void should_do_bitwise_and_boolean_operation() {
        final int value = 0x1234_abcd; //10010001101001010101111001101
        final int mask = 0x000f_ff00; // 00000000011111111111100000000
        //00000000001001010101100000000


        // TODO: please write down the result directly to pass the test.
        // <--start
        final int expected = 305920;
        // --end-->
        System.out.println(value & mask);
        assertEquals(expected, value & mask);
    }

    @Test
    void should_do_bitwise_or_boolean_operation() {
        final int value = 0x1234_0000; //10010001101000000000000000000
        final int mask = 0x0000_abcd; // 00000000000001010101111001101
        //10010001101001010101111001101
        // TODO: please write down the result directly to pass the test.
        // <--start
        final int expected = 305441741;
        // --end-->

        assertEquals(expected, value | mask);
    }

    @Test
    void should_do_bitwise_not_operation() {
        final int value = 0x0000_ffff; //1111111111111111

        // TODO: please write down the result directly to pass the test.
        // <--start
        final int expected = -65536;
        // --end-->

        assertEquals(expected, ~value);
    }
}
