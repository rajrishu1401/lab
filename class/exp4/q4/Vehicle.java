public abstract class Vehicle {
    protected String model;
    protected int make;
    Vehicle(String model,int make){
        this.model=model;
        this.make=make;
    }
    void serviceInfo(){
        System.out.println("Servicing details. model:"+model+"make:"+make);
    }
    abstract void startEngine();
    abstract void stopEngine();
}
