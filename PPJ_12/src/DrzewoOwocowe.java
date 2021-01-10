public class DrzewoOwocowe extends DrzewoLisciaste{
    String nazwaOwoca;

    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Nazwa owoca: " + nazwaOwoca;
    }

    public void zerwijOwoc() throws DrzewoBezOwocoweException {
        System.out.println("Zerwano: " + this.nazwaOwoca);
    }
}
