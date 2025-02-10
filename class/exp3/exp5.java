import java.util.*;

public class Product {
    int productId;
    String productName;
    String category;
    private double price;
    static int totalProduct=0;
    static ArrayList<Double> totalPrice = new ArrayList<>();
    Product(){
        this.productId=1;
        this.productName="Ball";
        this.category="Toy";
        this.price=20;
        totalProduct+=1;
        if(totalPrice.isEmpty()){
            totalPrice.add(this.price);
        }else{
            totalPrice.set(0,totalPrice.get(productId-1)+this.price);
        }
    }
    Product(int productId,String productName,String category, double price){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
        this.price=price;
        totalProduct+=1;
        if(totalPrice.size()<productId){
            totalPrice.add(this.price);
        }else{
            totalPrice.set(productId-1,totalPrice.get(productId-1)+this.price);
        }
    }
    public double getPrice(){
        return this.price;
    }
    public static void getTotalPrice(){
        double sum=0;
        for (double i:totalPrice){
            sum+=i;
        }
        System.out.println("Price of all products:"+sum);
    }
    public static void getPrice(int productId){
        System.out.println("Price of "+productId+":"+totalPrice.get(productId-1));
    }
    public static void getPrice(int productId,double discount){
        double totalProductPrice=totalPrice.get(productId-1);
        double discountPrice=totalProductPrice*(discount/100);
        totalProductPrice-=discountPrice;
        System.out.println("Price of "+productId+" with discount:"+totalProductPrice);
    }
    public void getPriceWithQuant(int quantity){
        double totalProductPrice= this.price*quantity;
        System.out.println("Price of:"+totalProductPrice);
    }
    public void getPriceWithQuant(int quantity , double discount){
        double totalProductPrice= this.price*quantity;
        double discountPrice=totalProductPrice*(discount/100);
        totalProductPrice-=discountPrice;
        System.out.println("Price of with discount:"+totalProductPrice);
    }
    public void displayProductInfo(){
        System.out.println("product id:"+this.productId+" product name:"+this.productName+" category:"+this.category+" price:"+this.price);
    }

    public static void displayTotalProducts(){
        System.out.println("total products count:"+totalProduct);
    }
    public static void main(String arg[]){
        Product obj=new Product();
        Product obj1=new Product(2,"Bat","Toy",150);
        Product obj2=new Product(3,"Football","Toy",100);
        obj2.getPriceWithQuant(20);
        obj2.getPriceWithQuant(20,50);
        Product obj3=new Product(3,"Football","Toy",100);
        Product.displayTotalProducts();
        obj.displayProductInfo();
        obj1.displayProductInfo();
        obj2.displayProductInfo();
        Product.getPrice(3);
        Product.getPrice(3,50);
        Product.getTotalPrice();
    }

}
