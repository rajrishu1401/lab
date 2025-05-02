public class Sphere extends Solid {
    double radius;
    Sphere(double radius){
        this.radius=radius;
    }
    void calculateVolume(){
        double volume= 4/3*(3.14*(this.radius*this.radius*this.radius));
        System.out.println("Volume of Sphere: "+volume);
    }
}
