public class Drzewo {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;

    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa) {
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }

    @Override
    public String toString() {
        return "Wiecznie Zielone: " + wiecznieZielone + "\n" + "wysokość: " + wysokosc +
                "\n" + "przekrój: " + przekrojDrzewa;
    }

    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        throw new DrzewoBezOwocoweException();
    }
}
