public class Motorcycle implements Vehicle{
    @Override
    public void start(){
        System.out.println("start the motorcycle");
    }
    @Override
    public void stop(){
        System.out.println("stop the motorcycle");
    }
    @Override
    public void getFuelLevel(){
        System.out.println("get fuel level of the motorcycle");
    }
}
