
public class Car {
    String make;
    String model;
    int year;

    Car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public void display(){
        System.out.println("make:"+this.make+" model:"+this.model+" year:"+this.year);
    }
    public static void main(String arg[]){
        Car obj=new Car("Tesla","Model 3",2025);
        obj.display();
    }
}
