import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class PPJ_12 {
    public static void main(String[] args) throws Exception {
        /*Drzewo drzewo = new Drzewo(false, 1, "1");
        Drzewo sosna = new DrzewoIglaste(false, 15, "30", 100000, 13);
        Drzewo modrzew = new DrzewoIglaste(false, 20, "40", 80000, 12);
        Drzewo dab = new DrzewoLisciaste(true, 30, "55", 2);
        Drzewo osika = new DrzewoLisciaste(true, 18, "25", 3);
        Drzewo morelowiec = new DrzewoOwocowe(true, 9, "25", 4, "morela");

        Drzewo[] las = {sosna, modrzew, dab, osika, morelowiec};

        for (Drzewo d: las){
            System.out.println(d);
        }

        Rakieta rakieta = new Rakieta("rocket", 0);
        rakieta.zatankuj();
        System.out.println(rakieta.wagaPaliwa);
        rakieta.start();*/

        String filename = "C:\\PROGRAMY\\text.txt";     // sciezka do pliku na dysku
        FileInputStream fis = new FileInputStream(filename);
        char[] charArr = new char[10];
        int counter = 0;

        while (fis.available() > 0) {
            if (counter >= charArr.length) {
                char[] tempArr = new char[charArr.length * 2];  // powiekszenie tablicy, jesli sie nie miesci
                for (int i = 0; i < charArr.length; i++) {
                    tempArr[i] = charArr[i];
                }
                charArr = tempArr;
            }
            char temp = (char) fis.read();      // odczytanie bajtu i rzutowanie na znak (char)
            charArr[counter] = temp;
            counter++;
        }

        // ---TESTOWE WYSWIETLENIE TEKSTU--- //
        for (char ch: charArr){
            System.out.print(ch + " ");
        }

        int[] charCountArr = new int[256];      //tablica znaków w ktorej liczymy ich wystąpienia w tekście

        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charCountArr.length; j++) {
                if ((int) charArr[i] == j){
                    charCountArr[j]++;
                }
            }
        }
        for (int i = 0; i < charCountArr.length; i++) {
            if (charCountArr[i] > 0){
                System.out.println((char) i + ": " + charCountArr[i]);
            }
        }
    }
}
