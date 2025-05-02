public class Main {
    public static void main(String[] arg){
        Vehicle car= new Car();
        Vehicle motocycle = new Motorcycle();
        car.start();
        car.stop();
        car.getFuelLevel();
        motocycle.start();
        motocycle.stop();
        motocycle.getFuelLevel();
    }
}
