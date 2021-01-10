import java.util.Random;

public class Rakieta {
    String nazwa;
    int wagaPaliwa;

    public Rakieta(String nazwa, int wagaPaliwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj(){
        Random random = new Random();
        this.wagaPaliwa = (int) (random.nextDouble() * 3000);
    }

    public void start() throws Exception {
        if (this.wagaPaliwa < 1000){
            throw new Exception("start anulowany - za mało paliwa");
        } else {
            System.out.println("start udany!");
        }
    }
}
