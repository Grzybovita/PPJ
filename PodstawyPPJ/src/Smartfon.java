public class Smartfon extends Komorka{
    Osoba[] znajomi = new Osoba[10];

    public Smartfon(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
    }

    void zadzwon(String numer){
        System.out.println("Dzwonię ze smartfona pod numer " + numer);
        for (int i = 0; i < znajomi.length; i++) {
            if (znajomi[i].numer.equals(numer)) {
                numer = znajomi[i].imie;
                break;
            }
        }
        super.zadzwon(numer);
    }
}

