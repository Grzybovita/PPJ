import java.util.Arrays;

public class PodstawyPPJ {
    public static void main(String[] args) {
        Punkt2D p2D1 = new Punkt2D(2, -2);
        Punkt2D p2D2 = new Punkt2D(3, 0);
        System.out.println(p2D1.odleglosc(p2D2));

        Osoba[] lista = {new Osoba("Jan", "Kowalski", "123456"),
                        new Osoba ("Piotr", "Almaszy", "111111"),
                        new Osoba ("Jan", "Pawel", "666666")};

        Telefon telefon = new Telefon("interfejs", "czarny");
        Komorka komorka = new Komorka("Nokia", "niebieski");
        Smartfon smartfon = new Smartfon("Samsung", "czerwony");

       Telefon[] telephones = {telefon, komorka, smartfon};
       smartfon.znajomi = lista;

            telephones[2].zadzwon("123456");
            telephones[2].zadzwon("111111");
            telephones[2].zadzwon("00000");
            telephones[2].zadzwon("123456");
            telephones[2].zadzwon("333555");

            telephones[2].wyswietlHistoriePolaczen();

    }
}
