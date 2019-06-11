package be.tomasdeman;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

class MathUtilsTest extends Object {


    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Nested
    class AddTest {

        @Test
        @DisplayName("Testing add method for +")
        void testAddPositive() {
            assertEquals(2, mathUtils.add(1, 1), "The add function should add two numbers");
        }

        @Test
        @DisplayName("Testing add method for -")
        void testAddNegative() {
            assertEquals(-2, mathUtils.add(-1, -1), "The add function should add two numbers");
        }
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0), "divide by zero should throw");
    }

    @Test
    void testMultiply() {
        assertAll(
                () -> assertEquals(4, mathUtils.multiply(2, 2)),
                () -> assertEquals(0, mathUtils.multiply(2, 0)),
                () -> assertEquals(-2, mathUtils.multiply(2, -1))
        );
    }

    @Test
    void testComputeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area.");
    }

}