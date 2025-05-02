public class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("start the car");
    }
    @Override
    public void stop(){
        System.out.println("stop the car");
    }
    @Override
    public void getFuelLevel(){
        System.out.println("get fuel level of the car");
    }

}
