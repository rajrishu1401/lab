public class Person {
    String name;
    int age;
    String address;
    Person(String name,int age,String address){
    	this.name=name;
    	this.age=age;
    	this.address=address;
    }
    public void displayInfo() {
        System.out.print("Name: " + this.name + ", Age: " + this.age + ", Address: " + this.address);
    }
}