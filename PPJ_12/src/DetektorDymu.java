public class DetektorDymu {

    public void sprawdz(boolean czyJestDym) throws Alarm {
        if (czyJestDym == true){
            throw new Alarm();
        }
    }
}
