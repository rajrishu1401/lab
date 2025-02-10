public class Car extends Vehicle {
    Car(String model,int make){
        super(model,make);
    }
    void startEngine(){
        System.out.println("Start Engine.");
    }
    void stopEngine(){
        System.out.println("Stop Engine.");
    } 
}
