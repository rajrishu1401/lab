public class DigitalWallet implements Wallet{
    private double balance;
    public void addFunds(double amount){
        this.balance+=amount;
    }
    public void spendFunds(double amount){
        this.balance-=amount;
    }
    public void getBalance(){
        System.out.println("Balance: "+this.balance);
    }
}
