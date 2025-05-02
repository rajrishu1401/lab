public class Television implements Remote{
    @Override
    public void powerOn(){
        System.out.println("TV in now on");
    }
    @Override
    public void powerOff(){
        System.out.println("TV is off");
    }
    @Override
    public void changeChannel(){
        System.out.println("Channel changed to X");
    }
}
