public class Printer {
    private int paper;
    private int toner;

    public Printer(int paper, int toner) {
        this.paper = paper;
        this.toner = toner;
    }

    public int reducePaper(int pages, int copies) {
        if((pages * copies) > paper) {
            return 0;
        }
        return paper - (pages * copies);
    }

    public int reduceToner(int pages, int copies) {
        if((pages * copies) > toner) {
            return 0;
        }
        return toner - (pages * copies);
    }
}





