public class Main {
    public static void main(String[] arg){
        Solid cube = new Cuboid(4);
        Solid sphere = new Sphere(2);
        cube.calculateVolume();
        sphere.calculateVolume();
    }
}
