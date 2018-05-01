import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

     Calculator testCalculator;

    @Before
    public void before() {

        testCalculator = new Calculator();
    }

        @Test
        public void testMultiply(){

            assertEquals(16, testCalculator.multiply(8,2), 0.1);

        }

        @Test
        public void testDivide(){

            assertEquals(12.5, testCalculator.divide(100, 8), 0.1);

        }

        @Test
        public void testAdd(){

            assertEquals(10, testCalculator.add(8,2), 0.1);

        }

        @Test
        public void testSubtract(){

            assertEquals(6, testCalculator.subtract(8,2), 0.1);

        }
    }
