public class Cuboid extends Solid{
    double side;
    Cuboid(double side){
        this.side=side;
    }
    @Override
    void calculateVolume(){
        double volume=side*side*side;
        System.out.println("Volume of Sphere: "+volume);
    }
}
