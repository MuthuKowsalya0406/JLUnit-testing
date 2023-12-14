import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static int Add(int a, int b) {
        return a + b;
    }

    public static int Sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    @Test
    public void testadd() {
        assertEquals("all not okay", 100, Add(60, 40));

    }

    @Test
    public void testsub() {
        assertEquals("ALL OKAY", 40, Sub(90, 50));
    }

    @Test
    public void testMultiply() {
        assertEquals("all okay", 16, multiply(4, 4));
    }

    @Test
    public void testDivide() {
        assertEquals("all okay", 5, divide(50, 5));
    }

}
