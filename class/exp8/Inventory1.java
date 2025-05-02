import java.util.HashMap;
public class Inventory1 {
    static int productiD;
    String name;
    int quantity;
    double price;
    Inventory1(int productID,String name,int quantity,double price){
        productiD=productID;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    @Override
    public String toString(){
        return "{name: "+this.name+" quantity: "+this.quantity+" Price: "+this.price+"} ";
    }
    public static void main(String[] arg){
        HashMap<Integer,Inventory1> products = new HashMap<>();
        Inventory1 p= new Inventory1(101,"Milk",3,35);
        products.put(Inventory1.productiD,p);
        Inventory1 p1= new Inventory1(102,"Potato",2,12);
        products.put(Inventory1.productiD,p1);
        Inventory1 p2= new Inventory1(103,"Tomato",4,20);
        products.put(Inventory1.productiD,p2);
        Inventory1 p3= new Inventory1(104,"chip",3,10);
        products.put(Inventory1.productiD,p3);
        
        System.out.println(products);

        products.get(101).quantity-=1;

        System.out.println(products);

        products.remove(102);

        System.out.println(products);


    }
}
