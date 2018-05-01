import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer testPrinter;

    @Before
    public void before(){

        testPrinter= new Printer (100, toner)
    }

    @Test
    public void canGetNumberOfSheets(){
        assertEquals(100, testPrinter.getNumberOfSheets());
    }

    @Test
    public void canPrint(){
        testPrinter.print(5,5);
        assertEquals(75, testPrinter.getNumberOfSheets());
    }

    @Test
    public void canPrint(){
        testPrinter.print(5,5);
        assertEquals(75, testPrinter.getNumberOfSheets());
    }
}


