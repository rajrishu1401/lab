public class Main {
    public static void main(String [] arg){
        DigitalWallet obj = new DigitalWallet();
        obj.addFunds(1000);
        obj.spendFunds(200);
        obj.getBalance();
    }
}
