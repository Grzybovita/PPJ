public class Punkt3D extends Punkt2D {
    int z;

    public double odleglosc(Punkt3D punkt3D){
        return Math.sqrt(Math.pow(punkt3D.x - this.x, 2) + Math.pow(punkt3D.y - this.y, 2) + Math.pow(punkt3D.z - this.z, 2));
    }
}
