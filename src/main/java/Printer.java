public class Printer {
    private int sheetsLeft;
    private int toner;

    public Printer(int sheetsLeft, int toner){
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;

    }
    public int getSheetsLeft(){
        return this.sheetsLeft;
    }

    public void print(int pages, int copies) {
        if (pages * copies <= this.sheetsLeft) {
            this.sheetsLeft -= pages * copies;
            this.toner -= pages * copies;
        }
    }

    public int getToner() {
        return this.toner;
    }
}
