/*import java.util.*;
public class Inventory <T>{
    int productID;
    String name;
    int quantity;
    double price;
    static HashMap<Integer,T> products = new HashMap<>();
    Inventory(int productID,String name,int quantity,double price){
        this.productID=productID;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
        this.mapping();
    }
    void mapping(){
        HashMap<String,T> prd = new HashMap<>();
        prd.put("name",this.name);
        prd.put("quantity",this.quantity);
        prd.put("price",this.price);
        //products.put(this.productID,prd);
        System.out.println(prd);
    }
    public static void main(String[] arg){
        Inventory p= new Inventory(101,"Milk",3,35);
        Inventory p1= new Inventory(102,"Potato",2,12);
        Inventory p2= new Inventory(103,"Tomato",4,20);
        Inventory p3= new Inventory(104,"chip",3,10);

        //System.out.println(products);

    }
}*/
