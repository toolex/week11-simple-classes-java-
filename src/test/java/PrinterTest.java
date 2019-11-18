import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 100);
    }

    @Test
    public void getSheetLeft(){
        assertEquals(100, printer.getSheetsLeft());
    }

    @Test
    public void notEnoughPaper(){
        printer.print(30, 5);
        assertEquals(100, printer.getSheetsLeft());
    }

    @Test
    public void enoughPaper(){
        printer.print(25, 2);
        assertEquals(50, printer.getSheetsLeft());
    }

    @Test
    public void getToner(){
        assertEquals(100, printer.getToner());
    }

    @Test
    public void useToner(){
        printer.print(25, 2);
        assertEquals(50, printer.getToner());
    }
}
