public class Printer {
    private int sheetsLeft;

    public Printer(int sheetsLeft){
        this.sheetsLeft = sheetsLeft;
    }
    public int getSheetsLeft(){
        return this.sheetsLeft;
    }

    public void print(int pages, int copies) {
        if (pages * copies <= this.sheetsLeft) {
            this.sheetsLeft -= pages * copies;
        }
    }
}
