import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 50);
    }

    @Test
    public void reducePaper() {
        int pages = 5;
        int copies = 5;
        assertEquals(75, printer.reducePaper(pages, copies));
    }

    @Test
    public void NotEnoughPaper() {
        int pages = 5;
        int copies = 30;
        assertEquals(0, printer.reducePaper(pages, copies));
    }

    @Test
    public void reduce_Toner() {
        int pages = 5;
        int copies = 5;
        assertEquals(25, printer.reduceToner(pages, copies));
    }

    @Test
    public void NotEnoughToner() {
        int pages = 5;
        int copies = 30;
        assertEquals(0, printer.reduceToner(pages, copies));
    }


}

