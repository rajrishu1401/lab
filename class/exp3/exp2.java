public class Customer {
    private double balance=0;
    public void addBalance(double amount){
        this.balance+=amount;
    }
    void showBalance(){
        System.out.println("Balance:"+this.balance);
    }
    public void addBalance(int amount){
        this.balance+=amount;
    }
    protected void deductBalance(double amount){
        this.balance-=amount;
    }
    public static void main(String arg[]){
        Customer obj=new Customer();
        obj.showBalance();
        obj.addBalance(4500.25);
        obj.showBalance();
        obj.addBalance(450);
        obj.showBalance();
        obj.deductBalance(98.78);
        obj.showBalance();
    }
}
