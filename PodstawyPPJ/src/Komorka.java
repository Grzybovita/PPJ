public class Komorka extends Telefon{
    String[] lastCalls = new String[10];
    int count = 0;

    public Komorka(String interfejsKomunikacyjny, String color) {
        super(interfejsKomunikacyjny, color);
    }

    void zadzwon(String numer){
        System.out.println("Dzwonię z Komorki pod numer " + numer);
        if (count == lastCalls.length){
            for (int i = 1; i < lastCalls.length; i++) {
                lastCalls[i-1] = lastCalls[i];
            }
            lastCalls[lastCalls.length - 1] = numer;
        } else {
            lastCalls[count] = numer;
            count++;
        }
    }

    void wyswietlHistoriePolaczen(){
        for (int i = 0; i < count; i++) {
            System.out.println(lastCalls[i]);
        }
    }

}
