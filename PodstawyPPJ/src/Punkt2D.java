public class Punkt2D {
    int x;
    int y;

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt2D() {
    }

    public double odleglosc(Punkt2D punkt2D) {
        return Math.sqrt(Math.pow(punkt2D.x - this.x, 2) + Math.pow(punkt2D.y - this.y, 2));
    }
}
