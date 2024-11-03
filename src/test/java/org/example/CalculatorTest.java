    package org.example;
    import org.junit.jupiter.api.*;
    import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class CalculatorTest {

    Calculator calculator;


    @BeforeEach                            //Detta körs innan varje deltest initieras.
    public void runBeforeEachTest(){
        calculator = new Calculator();
    }

    @Test
    @Order(1)
    @DisplayName("Test if number is odd")
    public void testIfNumberIsOddThenTrue(){
        assertTrue(calculator.isOdd(5));
    }

    @Test
    @Order(2)
    @DisplayName("Test if number is even")
    public void testIfNumberIsEvenThenFalse(){
        assertFalse(calculator.isOdd(6));
    }

    @Test
    @Order(3)
    @DisplayName("Test addition")
    public void testAddingTwoNumbers() {
        assertEquals(22, calculator.add(10,12));
    }

    @Test
    @Order(4)
    @DisplayName("Test subtraction")
    public void testSubtract() {
        assertEquals(7, calculator.subtract(30,23));
    }

    @Test
    @Order(5)
    @DisplayName("Test multiplication")
    public void testMultiply() {
        assertEquals(35, calculator.multiply(7,5));
    }

    @Test
    @Order(6)
    @DisplayName("Test multiplication with zero")
    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0,7));
    }

    @Test
    @Order(7)
    @DisplayName("Test division")
    public void testDivision() {
        assertEquals(6, calculator.divide(30,5));
    }

    @Test
    @Order(8)
    @DisplayName("Test square root")
    public void TestSquareRootOf() {
        assertEquals(6, calculator.squareRootOf(36));
    }

    @Test
    @Order(9)
    @DisplayName("Test get area of a circle")
    public void TestGetArea() {
        assertEquals(28.27, calculator.getArea(3));
    }

    @Test
    @Order(10)
    @DisplayName("Test get circumference of a circle")
    public void testGetCircumference() {
        assertEquals(37.7, calculator.getCircumference(6));
    }
}